package com.ustglobal.springmvc.service;

import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;

public interface RetService {

	public int buyProduct(int id);
	public Retailer login(int id,String password);
	public Product searchProductO(int id);
	public int register(Retailer bean);
	public int registerProduct(Product bean);
	public Retailer searchorders(int id);
	
	public boolean changePassword(int id,String password);
	
}
