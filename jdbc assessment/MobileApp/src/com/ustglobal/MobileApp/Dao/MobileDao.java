package com.ustglobal.MobileApp.Dao;

import java.util.List;

import com.ustglobal.MobileApp.Dto.MobileBean;

public interface MobileDao {

	public List<MobileBean> showContacts();
	public MobileBean searchContacts(String name);
	public int insert(MobileBean bean);
	public int update(MobileBean bean);
	public int delete(MobileBean bean);
	
	
}
