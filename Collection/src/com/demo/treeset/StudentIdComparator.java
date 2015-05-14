package com.demo.treeset;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student paramT1, Student paramT2) {
	     
		if(paramT1.getId()>paramT2.getId()){
			return paramT1.getId()-paramT2.getId();
		}else if(paramT1.getId()<paramT2.getId()){
			return paramT1.getId()-paramT2.getId();
		}else {
			return paramT1.getId()-paramT2.getId();
		}
	
	
	}
}
