package com.demo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingListImpl {

	public static void main(String[] args) {
		
		
		List list=new LinkedList();
		list.add(new Teacher(101, "rajeev", 26));
		list.add(new Teacher(102, "devendra", 56));
		list.add(new Teacher(203, "Hello", 123));
		
		System.out.println(list);
		
		 Collections.sort(list,new TeacherAgeComparator());;
		 System.out.println(list);
		 
		 // what is difference between linkedList and ArrayList 
// 
		  // to fetch data from array list is faster than linkedList. 
		  //IN linkedList deletion is faster than arrayList. 
		  // In linnkedList insertion is faster than ArrayList. 
		 
		 //  What is differnce between ArrayList and LinkedList in
		 
		
	}
}
