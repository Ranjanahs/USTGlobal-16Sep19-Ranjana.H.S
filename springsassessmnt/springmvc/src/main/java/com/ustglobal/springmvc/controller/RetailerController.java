package com.ustglobal.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;
import com.ustglobal.springmvc.service.RetService;

@Controller
public class RetailerController {

	@Autowired 
	private RetService service;
	
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@PostMapping("/login")
	public String login(int id,String password, HttpServletRequest request) {
		Retailer bean=service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "invalid Credentials");
		    return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/register")
	public String register(Retailer bean ,ModelMap map) {
	int check=	service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "you are Registerd for this id:"+check);
			
		}else {
			map.addAttribute("msg","email is repeated");
			
		}
		return "login";
	}//end of register
	
	
	
	@GetMapping("/regpro")
	public String registerprod() {
		return "regproduct";
	}

	@PostMapping("/regpro")
	public String registerprod(Product bean ,ModelMap map) {
	int check=	service.registerProduct(bean);
		if(check>0) {
			map.addAttribute("msg", "you are Registerd for this id:"+check);
			
		}else {
			map.addAttribute("msg","email is repeated");
			
		}
		return "login";
	}//end of register
	
	 @GetMapping("/changepassword")
     public String changepassword(HttpServletRequest request) {
    	 HttpSession session =request.getSession(false);
    	 if(session!=null) {
    	 return "changepassword";
    	 }else {
    		 return "login";
    	 }
     }//end of cp
     
     @PostMapping("/changepassword")
     public String changepassword(String password,String confirmpassword,
    		 @SessionAttribute(name="bean")Retailer bean,ModelMap map) {
    	if(password.equals(confirmpassword)) {
    		service.changePassword(bean.getId(), password);
    		map.addAttribute("msg","password changed");
    	}else {
    		map.addAttribute("msg","password not matching");	
    	}
    	 return "home";
     }
	

     @GetMapping("/search") 
     public String search(@RequestParam("pid") int id,ModelMap map) {
    	Product bean = service.searchProductO(id);
    	 if(bean==null) {
    		 map.addAttribute("msg", "Data not found");
    	 }else {
    		 map.addAttribute("bean",bean);
    		}
    	 return "home";
     }
     @GetMapping("/logout")
     public String logout(HttpSession session) {
    	 session.invalidate();
    	 return "login";
     }
	
     
   

 	@PostMapping("/buy")
 	public String buyprod(Product bean ,ModelMap map) {
 	int check=	service.buyProduct(bean.getPid());
 		if(check>0) {
 			map.addAttribute("msg", "you are buy for this id:"+check);
 			
 		}else {
 			map.addAttribute("msg","product not present");
 			
 		}
 		return "login";
 	}//end of register
     
}
