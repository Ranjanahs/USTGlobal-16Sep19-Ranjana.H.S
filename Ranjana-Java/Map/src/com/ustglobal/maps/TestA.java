package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
 public static void main(String[] args) {
	HashMap hm= new HashMap();
	hm.put("kullu", 89287);
	hm.put("tms", 785644);
	hm.put("mts", 745612);
	hm.put(null,98989);
	hm.put(null, 785210);
	System.out.println("data"+hm);
	hm.put("tms",7878789);
	System.out.println("aftr modify"+hm);//fr keys-duplicates nt allowed
	hm.put("kulli",89287);
	System.out.println("aftr modify"+hm);//fr value-duplictes are allowed
	System.out.println("aftr null"+hm);//fr value-any num null allowd
	System.out.println("----------------");
	System.out.println("aftr addng duplicate null");
	System.out.println(hm);
	System.out.println("---------------------");
	Object name=hm.get("kullu");
	System.out.println("value "+name);
	System.out.println("----------------------");
	Object value=hm.remove("kullu");
	System.out.println("value="+value);
	System.out.println("aftr remove="+hm);//does nt presrve insertions ordr
}
}
