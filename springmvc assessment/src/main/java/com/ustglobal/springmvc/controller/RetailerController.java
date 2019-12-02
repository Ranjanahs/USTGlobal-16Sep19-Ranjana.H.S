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

import com.ustglobal.springmvc.dto.RetailerBean;
import com.ustglobal.springmvc.service.RetailerService;

@Controller
public class RetailerController {
    
	@Autowired
	private RetailerService service;

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request) {
		RetailerBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg","Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "login";
		}
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/register")
	public String register(RetailerBean bean,ModelMap map) {
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg","You are Registered and Id is"+check);
		}else {
			map.addAttribute("msg","Email is repeated");
		}
		return "login";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("id")int id,ModelMap map) {
		RetailerBean bean = service.searchOrders(id);
		if(bean==null) {
			map.addAttribute("msg","Data not found");
		}else {
			map.addAttribute("bean",bean);
		}
		return "login";
	}
	
	@GetMapping("/changepassword")
	public String changepassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
			
	}
		
	@PostMapping("/changepassword")
	public String changepassword(String password,String password1,@SessionAttribute(name="bean")RetailerBean bean,ModelMap map) {
		        	if(password.equals(password1)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg","Password Changed");
		}else {
			map.addAttribute("msg","Password not matching");
		}
		return "login";
	}
	
	
	
	

	
	
}
