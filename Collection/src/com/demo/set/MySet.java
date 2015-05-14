package com.demo.set;

import java.util.TreeSet;

public class MySet {

	
	public static void main(String[] args) {
		//how set provide uniquness. 
		//how treeset sorts data 
		// can treeset sorts data in reverse order  ? 
		// 
		
		TreeSet hashSet=new TreeSet();
		
		hashSet.add(2); // wrapper class // autoboxing.  //  hashSet.add(new Integer(2));
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(2); // wrapper class // autoboxing.  //  hashSet.add(new Integer(2));
		hashSet.add(5);
		hashSet.add(2);
		hashSet.add(12);
		hashSet.add(6);
		hashSet.add(2); // wrapper class // autoboxing.  //  hashSet.add(new Integer(2));
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(56);
		hashSet.add(2); // wrapper class // autoboxing.  //  hashSet.add(new Integer(2));
		hashSet.add(12);
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(10);
		 System.out.println(hashSet);
		//Integer class has overridden hashCode() and equals () method . 
		 //hashSet internally calling that hashCode and equals method to provide uniqueness. 
		
	}
}
