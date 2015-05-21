package com.demo.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableImple {
	public static void main(String[] args) {


		Hashtable<Float,Integer> hashtable=new Hashtable<Float, Integer>();
		// Hash table is thread safe. 
		// you can not insert null as key in hash table. .
	
		 hashtable.put(1f, 11);
		 hashtable.put(12f, 15);
		 
		 hashtable.put(14f, 14);
		 
		 hashtable.put(14f, 13);
		 
		 hashtable.put(15f, 12);
		 
		 System.out.println(hashtable);
		 
		 
		  System.out.println("value :"+hashtable.get(12f));
		  
		  
		  // if you dont know key. 
		   // then you have to iterate the map according to its key. 
		  
		  // first way  by iterating key. 
		  
		  
		  //for each () 
		  // iterator() 
		  
		  for (Float f : hashtable.keySet()) {
		
			  System.out.println("Key:"+f + " value:"+hashtable.get(f));
			//  hashtable.remove(12f);  concurrent modification exception will be raised. 
			  
		}
		  
		  
		 Set<Float> set=    hashtable.keySet();
		  
		 Iterator<Float> iterator=  set.iterator();
		  
		 while (iterator.hasNext()) {
			Float float1 = (Float) iterator.next();
			System.out.println("key :"+float1);
		}
		 
		 // another aproach to iterate map is entryset. 
		 
		 
Set<Entry<Float, Integer>> entrySet= hashtable.entrySet();
		 
		   
              Iterator<Entry<Float, Integer>> iterator3=    entrySet.iterator();
		  
		  System.out.println("========================== Using Entry set ======");
		  while (iterator3.hasNext()) {
		   Entry<Float, Integer> entry=iterator3.next();
		   System.out.println("key"+entry.getKey());
           System.out.println("value:"+entry.getValue());			
		}
		 
		/**
		 *  
		 *  Enumeration...
		 *   
		 */
		  
		  //enum  
		  //  java generics and collection. 
		  //  read it in reverse direction. 
		  
		  Enumeration<Integer>enumeration =  hashtable.elements();
		   while (enumeration.hasMoreElements()) {
			Integer i = (Integer) enumeration.nextElement();
			System.out.println(" value: "+i);
		}
		// hashTable.keys() returns enumeration of keys
		   
		   // TreeMap sorts data according to key.
		  // whatever the key is . It must be comparable. otherwise you cannot sort it. 
	
	}
}
