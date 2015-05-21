package com.demo.map;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		
		
		TreeMap<String, Integer> treeMap=new  TreeMap<String, Integer>(Collections.reverseOrder());
		
		treeMap.put("key1",22);

		treeMap.put("key3",22);

		treeMap.put("key5",22);

		treeMap.put("key4",22);
		
		System.out.println(treeMap);
		 // change here. 
		
		TreeMap<Student, Address> studentAddressMap=new  TreeMap<Student, Address>();
		
		
		studentAddressMap.put(new Student(101, "rajeev"), new  Address());
		studentAddressMap.put(new Student(110, "rajeev"), new  Address());
		studentAddressMap.put(new Student(121, "rajeev"), new  Address());
		studentAddressMap.put(new Student(131, "rajeev"), new  Address());
		studentAddressMap.put(new Student(111, "rajeev"), new  Address());
		
		System.out.println(studentAddressMap);
	}
}
