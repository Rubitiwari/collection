package com.demo.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.treeset.StudentIdComparator;

public class MyListImple {

	
	public static void main(String[] args) {
		
		
		//why list is popular. 
		//1:- because list allow duplicates elements.. 
		//2:= List is index based. 
		// 0  --- 9 
		  
		
		  //exactrly similar working as array the only one differece is this is dynamic. 
		//0   1 2.3.4.5.6. 
		// ar[10];
		 
		  List<Integer> list=new  ArrayList<Integer>(); //loose coupling. 
		  
		  list.add(new Integer(23));
		  list.add(new Integer(24));
		  
		  list.add(new Integer(25));
		  ////4444
		  
		  
		  
		  
		  
		  list.add(new Integer(23));
		  
		  list.add(new Integer(23));

		   System.out.println(list.get(6));
		   // you can get any object from any index using array list. 
		   
		   
		   
		  for (Object object : list) {
			
			  Integer integer=(Integer)object;
			  
		}
		System.out.println(list);
		
		
		
	Set set=converArrayToSet(new Integer[]{1,2,3});
		//System.out.println(set);
	}
	
	
	public static Set converArrayToSet(Object []ar){
		if(ar!=null && ar.length>0){
			HashSet  myHashSet=new HashSet();
            for (Object object : ar) {
            	myHashSet.add(object);
			}
            return myHashSet;
		}else {
			return null;
		}
	}
}
