package com.ustglobal.springmvc.dao;

import com.ustglobal.springmvc.dto.ProductBean;
import com.ustglobal.springmvc.dto.RetailerBean;

public interface RetailerDAO {
   
	public RetailerBean login(int id,String password);
	public ProductBean searchProduct(int id);
	public int register(RetailerBean bean);
	public RetailerBean searchOrders(int id);
	public boolean changePassword(int id,String password);
	
	
	
}
