package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestE {
   public static void main(String[] args) {
	    TreeMap<String,Integer> lh=new TreeMap<String,Integer>();
		lh.put("Patna",560068);
		lh.put("Hariyana",135864);
		lh.put("Bangalore",880000);
		//lh.put(null,78789);---nullpointerexception
		
		for(Map.Entry<String, Integer> m:lh.entrySet()) {
			String key=m.getKey();
			Integer value=m.getValue();
			System.out.println("Key is="+key+"----"+"value="+value);
			System.out.println("----------------------");
		}
}
}
