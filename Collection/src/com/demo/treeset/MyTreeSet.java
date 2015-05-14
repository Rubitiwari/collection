package com.demo.treeset;

import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
 
		 TreeSet set=new TreeSet();
		 set.add(new String("A"));
		 set.add(new String("e"));
		 set.add(new String("a"));
		 set.add(new String("b"));
		 set.add(new String("d"));
		 set.add(new String("c"));
		 //byte internally treeset usage comparable to sort data. 
		 //1:- any object you add in treeset must be  comparable.
		 //2:- if no comparable. then you will get run time exception.
		 
		 System.out.println(set); 
		 //ascii     A --Z   -- 65--90 
		 // a --z  -- 97- 122 

	}
}
