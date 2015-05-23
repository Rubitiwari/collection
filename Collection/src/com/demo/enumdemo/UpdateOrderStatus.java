package com.demo.enumdemo;

import java.util.Iterator;

public class UpdateOrderStatus {

	
	public static void main(String[] args) {
		
		
		
		OrderStatus orderStatus=new OrderStatus();
		
		orderStatus.setOrderStatus(OrderContantsEnum.DELIVERY_DELIVERED);

              //System.out.println(OrderContantsEnum.valueOf("DELIVERY_DELIV"));
		
         OrderContantsEnum or[]=     OrderContantsEnum.values();
              
         
          for (OrderContantsEnum orderContantsEnum : or) {
			
        	  //page no 45 . chapter 3.5 
        	  System.out.println(orderContantsEnum);
		}
         
		System.out.println(orderStatus.getOrderStatus());
		
	
	}
	
}
