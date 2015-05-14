package com.demo.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSetEmp {

	
	public static void main(String[] args) {
		
		
		TreeSet treeSet=new TreeSet();
		
		treeSet.add(new Student(102, "Devendra",45));
		treeSet.add(new Student(101, "rajeev", 26));
		treeSet.add(new Student(101, "rajeev", 26));
		treeSet.add(new Student(105, "xyz", 12));
		treeSet.add(new Student(104, "pqr", 13));
		
		//treeSet.remove(new Student(101, "rajeev", 26));
		 //
		
		 //compareTo() returns integers 
		 // +ve   0    -ve
		  // 1  0   -1
		
		  //3>2   return +ve   +1
		  //3<2  return -ve  -1
		  // elese return    0 
       System.out.println(treeSet);	
       
       
       //in for each during itration if you remove element from set then 
       // you will get concurrent modification exception. 
      
       
       for (Object object : treeSet) {
		 
    	     Student student=(Student)object;
    	     System.out.println(student.getId());
    	     if( student.getId()==101){
    	    	// treeSet.remove(student);
    	     }
	} // you iterator..  faster than foreach loop. 
       
       
       System.out.println("===============================================");
        Iterator iterator=treeSet.iterator();
       
        
        
         while(iterator.hasNext()){
        	 
        	Student student =  (Student) iterator.next();
        	  if(student.getId()==104){
        		  iterator.remove();  //tree
        	  }
        	  System.out.println(student);
         }
       System.out.println("============================================");
       
       
        /*
         * if one thread is  iterating and another thread is modifying strutcture of 
         *  set object then again you will get concurrentModificationException. 
         * 
         *    / / to deal with either synchronize that set and use another classes 
         *     //available in java.util.concurrent package.. 
         * 
         */

       
       
       
       TreeSet treeSetAge=new TreeSet(new AgeComparator());
       
         treeSetAge.addAll(treeSet);
		System.out.println(treeSetAge);
		
		 TreeSet treeSetId=new TreeSet(new StudentIdComparator());
		 treeSetId.addAll(treeSetAge);
		  
		 // there is no get method method available in set interface. 
		 
		
		  System.out.println(treeSetId);
	}
}
