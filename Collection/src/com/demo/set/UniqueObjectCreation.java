package com.demo.set;

import java.util.HashSet;

public class UniqueObjectCreation {
	public static void main(String[] args) {

		  Employee e=new Employee(101, "rajeev");
		  Employee e2=new Employee(102, "Dewendra");
		  Employee e3=new Employee(103, "rajeev");
		  Employee e4=new Employee(104, "Dewendra");
		  Employee e5=new Employee(101, "rajeev");
		  Employee e6=new Employee(106, "Dewendra");
		  
		  
		  HashSet employeeSet=new HashSet(); //doesnot maintain order. 
		  
		  System.out.println(employeeSet.add(e));
		  System.out.println(employeeSet.add(e2));
		  System.out.println(employeeSet.add(e3));
		  System.out.println(employeeSet.add(e4));
		  System.out.println(employeeSet.add(e5));
		  System.out.println(employeeSet.add(e6));
   
		  
		  //map   --- >  key and value. 
		  //key must be unique , hashCode() & equals() .
		  // sorting.. 
		  
		  // LInkedHashSet maintains order. 
		  
		   //TreeSet  //provided data into sorted order. 
		   //in java there are two class which is responsible for sorting. 
		   
		   //1:- Comparable 
		   //2:- Comparator. 
		  
		  //Comparable & Comparator. 
		  
		   
		  System.out.println("Size is:"+employeeSet.size());
		 // System.out.println(employeeSet);
		  
		
		
		
	}
}
