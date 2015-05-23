package com.demo.enumdemo;

public enum OrderContantsEnum {

	//given are object of enum translated class and these objects are final static  in nature

	DELIVERY_UNDER_PROCESS(1),DELIVERY_DISPATCHED(2),DELIVERY_IN_TRANSIT(3),DELIVERY_DELIVERED(4);
	private int value;
	
	
	
	private OrderContantsEnum(int value) {
		this.value=value;
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}

	
	public void getDAte(){
		
	}

	
	// IN JAVA enum  is class. which will be trans

	// if there is object then there must be constructure. 
	// and in enum contructor is private it mean no one can crease object of enum outside the 
	// enum class. 


}
