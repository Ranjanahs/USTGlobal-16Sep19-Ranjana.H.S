package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
	HashMap hm=new HashMap();
	hm.put("kullu", 89287);
	hm.put("tms", 785644);
	hm.put("mts", 745612);
	
	HashMap hm1=new HashMap();
	hm1.put("deepu", 789456);
	hm1.put("riya",456123);
	hm1.put("kriti",451231);
	
	boolean hasKey=hm.containsKey("mala");
	System.out.println("HasKey="+hasKey);//returns true if data is present
	
	boolean hasValue=hm1.containsValue(456123);
	System.out.println("hasvalue="+hasValue);//returns true if it contains data
	
	hm.putAll(hm1);//copies all data frm hm to hm1
	System.out.println("-----------------");
	System.out.println("aftr put all"+hm);
	
	System.out.println(hm.size());//to check size
	
	boolean isEmpty=hm.isEmpty();
	System.out.println("empty???!!= "+isEmpty);//to check empty/nt
	
//	hm.clear();-clear all data.
//	System.out.println("aftr clear"+hm);
}
}