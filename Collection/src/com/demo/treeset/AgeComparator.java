package com.demo.treeset;

import java.util.Comparator;

public class AgeComparator implements Comparator{

	@Override
	public int compare(Object paramT1, Object paramT2) {
		 
		if(paramT1 instanceof Student && paramT2 instanceof Student){
			 Student student1=(Student)paramT1;
			 Student student2=(Student)paramT2;

			 if(student1.getAge()>student2.getAge()){
				 return student1.getAge()-student2.getAge(); // return 1;
			 }else if(student1.getAge()<student2.getAge()) {
				 return student1.getAge()-student2.getAge(); // -5;
			 }else {
				 return 0;
			 }
			 
		 }
		
		return 0;
	}
}
