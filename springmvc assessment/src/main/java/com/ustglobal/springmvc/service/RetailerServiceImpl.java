package com.ustglobal.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvc.dao.RetailerDAO;
import com.ustglobal.springmvc.dto.ProductBean;
import com.ustglobal.springmvc.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService {
	
	@Autowired
	private RetailerDAO dao;

	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}

	@Override
	public int register(RetailerBean bean) {
		return dao.register(bean);
	}

	@Override
	public RetailerBean searchOrders(int id) {
		return dao.searchOrders(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id,password);
	}

}
