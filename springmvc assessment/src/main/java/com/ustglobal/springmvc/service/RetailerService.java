package com.ustglobal.springmvc.service;

import com.ustglobal.springmvc.dto.ProductBean;
import com.ustglobal.springmvc.dto.RetailerBean;

public interface RetailerService {

	public RetailerBean login(int id,String password);
	public ProductBean searchProduct(int id);
	public int register(RetailerBean bean);
	public RetailerBean searchOrders(int id);
	public boolean changePassword(int id,String password);
	
}
