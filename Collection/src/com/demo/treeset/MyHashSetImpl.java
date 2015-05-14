package com.demo.treeset;

import java.util.HashSet;

public class MyHashSetImpl {

	
	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		set.add(16);
        
	      int i=20;
	      
	      System.out.println(set.contains(i)); //false
	      
		HashSet dataToCheck=new HashSet();
		dataToCheck.add(12);
		dataToCheck.add(13);
		dataToCheck.add(14);	
		   
		System.out.println(set.containsAll(dataToCheck));
		
		  System.out.println("Size :"+ set.size());
		  System.out.println("isEmpty :"+set.isEmpty());
		  //retainAll and removeAll() 
		  //
		  set.retainAll(dataToCheck);
		  System.out.println(set);
	}
}
