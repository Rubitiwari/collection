package com.demo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyListIteration {


	public static void main(String[] args) {


		List  list=new ArrayList();
		list.add(2);
		list.add(1, 3);
		list.add(2); //2

		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		// In list there is get method available. 

		System.out.println( list.get(1));

		System.out.println("=============");
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}
		System.out.println("===============");
		System.out.println("=====Usig Foreach ======");
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("==============");

		System.out.println("==== Using iterator=====");
		Iterator iterator=  list.iterator();
		//unidirectional..  ------ > 
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);

		}
		System.out.println("===========");
		System.out.println("===== Using ListIteratior=====");
		ListIterator listIterator=  list.listIterator(2);

		System.out.println(" === List iterator in forword direction ======== ");
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			System.out.println(object);
		}


		System.out.println("==========  List iterator in backword direction =====");
		while(listIterator.hasPrevious()){
			Object object=     listIterator.previous();	 
			System.out.println(object);
			 if((Integer)object%6 ==0)
			  listIterator.add(100);
		}
		System.out.println("===================================================");

     
      Collections.sort(list,Collections.reverseOrder());
      System.out.println("List after sorting..");
      System.out.println(list);
      
      System.out.println("=== After suffling.. ===");
      Collections.shuffle(list);
      System.out.println(list);
       Collections.shuffle(list);
       System.out.println(list);
      
	}

}
