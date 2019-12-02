package com.ustglobal.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvc.dao.RetailerInterface;
import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;
@Service
public class RetServiceimpl implements RetService {

	
	@Autowired
	private RetailerInterface dao;
	
	@Override
	public Retailer login(int id, String password) {
		
		return dao.login(id, password);
	}

	@Override
	public Product searchProductO(int id) {
		
		return dao.searchProductO(id);
	}

	@Override
	public int register(Retailer bean) {
		
		return dao.register(bean);
	}

	@Override
	public Retailer searchorders(int id) {
		
		return dao.searchorders(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		
		return dao.changePassword(id, password);
	}

	@Override
	public int registerProduct(Product bean) {
		return dao.registerProduct(bean);
	}

	@Override
	public int buyProduct(int id) {
		
		return dao.buyProduct(id);
	}

}
