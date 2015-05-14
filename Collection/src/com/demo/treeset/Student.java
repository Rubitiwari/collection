package com.demo.treeset;

public class Student implements Comparable {

	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.age = age;
		this.name = name;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		System.out.println("inside compare to.");

		Student student=(Student)o;
		
		/*
		if(this.getId()>student.getId()){
			return this.getId()-student.getId();
		}else if(this.getId()<student.getId()){
			return this.getId()-student.getId();
		}else {
			return this.getId()-student.getId();
		}*/
		
		return this.getName().compareTo(student.getName());
	}


	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Student student=(Student)obj;
		return this.id==student.id;
	}

	@Override
	public String toString() {
		return "Student["+this.name+","+this.age+","+this.id+']';
	}
}
