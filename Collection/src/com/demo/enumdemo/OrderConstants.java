package com.demo.enumdemo;

public class OrderConstants {
	
// delivery status. 
	
	    // under process. 
	   // dispatched 
	   // in transit. 
	   // delivered. 
	
	public static final int DELIVERY_STATUS_UNDER_PROCESS=1;

	public static final int DELIVERY_STATUS_DISPATCHED=2;


	public static final int DELIVERY_STATUS_IN_TRANSIT=3;


	public static final int DELIVERY_STATUS_DELIVERED=4;

	// there is no  type safety using public static final . 
	
	 //  to remove this problem enum comes into picture. 
	 // it means the enum provide type 
	
	
	
}
