package com.ustglobal.MobileApp.Util;

import com.ustglobal.MobileApp.Dao.MobileDao;
import com.ustglobal.MobileApp.Dao.MobileDaoImpl;

public class MobileManager {
	private MobileManager() {
		
	}
	public static MobileDao getMobileDao() {
		return new MobileDaoImpl();
	}

}
