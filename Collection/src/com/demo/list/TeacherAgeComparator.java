package com.demo.list;

import java.util.Comparator;

public class TeacherAgeComparator  implements Comparator<Teacher>{

	@Override
	public int compare(Teacher paramT1, Teacher paramT2) {

		 if(paramT1.getAge()>paramT2.getAge()){
			 return -1;
		 }else if(paramT1.getAge()<paramT2.getAge()){
			 return 1;
		 }else {
			 return 0;
		 }
		
	}
	
}
