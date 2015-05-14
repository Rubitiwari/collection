package com.demo.set;

public class Employee {

	private int id;
	private String name;

	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println("inside hashcode"+id);
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
	    System.out.println("Equals method..");
		return this.id==((Employee)obj).getId();
	}
	@Override
	public String toString() {
		return this.getClass().getName()+"@"+hashCode();
	}
}
