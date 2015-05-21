package com.demo.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyMapImpl {

	
	public static void main(String[] args) {
		
		Map  map=new  LinkedHashMap();
	    map.put("key4", "value1");
	    map.put("key3", "value2");
	    map.put("key2", "value3");
	    map.put("key1", "value4");
	    map.put(null, null);

	    
	    
	    
	    
	    System.out.println(map);
	    
	    System.out.println(map.get("key3"));
	    
	    System.out.println(map.containsKey("key3"));
	    System.out.println(map.containsValue("value5"));
	
	
	
	}
	
   
}
