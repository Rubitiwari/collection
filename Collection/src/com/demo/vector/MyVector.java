
package com.demo.vector;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class MyVector {
	public static void main(String[] args) {


		//ArrayList and Vector..
       
		 LinkedList  linkedList=new  LinkedList();

		   linkedList.add(2);
		   linkedList.add(3);
		   linkedList.add(5);
		   linkedList.offer(6);
		   
		   PriorityQueue priorityQueue=new PriorityQueue();
		   priorityQueue.add(23);
		  
		   
		   // java.util.concurrent package. 
		   
		   
		   //Stack , PriorityQue, 
		   // CopyOnWriteArrayList<E>
		  // CopyOnWriteArraySet<E>
		   //Queue method peek and pol 
		   // get data from queue but peek don't remove data while pol remove data from queue. 
		   
		   //you can create your custom linkedList in java . 
		   
		   // Make your own custom linkedList and then use that. 
		   
		   
		   // how to create a custom LinkedList in java  . Use inner classes   .....
		   
		   
		   System.out.println(linkedList.size());
		   System.out.println(linkedList.peek());
		   System.out.println(linkedList.peek());
		   System.out.println(linkedList.size());
		   System.out.println("Pol"+linkedList.poll());
		   System.out.println("size:"+linkedList.size());
		   System.out.println("Pol"+linkedList.poll());
		   
		 
  
		//1:-  vector 's class all method are thread safe

		// Initial capacity  -- 10 element.  
		//and load factor  arraylist increments its size 50% of its total capacity. 
		// vector incremnts its size to 200%;
		//  10 -- 30  -- in vectory 
		// arraylist 10 -- > 15. 

	}
}
