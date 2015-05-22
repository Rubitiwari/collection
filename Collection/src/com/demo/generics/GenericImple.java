package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericImple {


	public static void main(String[] args) {

		GenericClass<String> genericString=new GenericClass<String>();
		genericString.ab("Helo");  // now Generic Class is type safe class. 


		GenericClass<Integer> genericInteger=new GenericClass<Integer>();

		genericInteger.ab(23);

		// what is the purpose of type safe class.  ?? 
		//  compiler force  to insrt data of same type at compile time. 



		List<String> list=new ArrayList<String>();
		list.add("abc");
		//list.add(2);
		//list.add(2.5f);
		// you can insert anything inside this list. 
		// so you may make a mistake of adding other class object 

		// 1:- type safety means compile time checking. 
		// 2:- type safety is  compile time concept there is no info at run time. 
		//3:- Compiler uses eraser type so that it erase <> at compile time.   so 
		// there is no info related to generics at run time. 
		//4:_  generics came in 1.5.

		for (Object object :	 list) {
			String a=(String)object;
		}

		List<Integer> integers=new ArrayList<>();
		//   <Integer>                      <Integer> 
		integers.add(23);
		integers.add(34);

		List<Person> listOfPerson=new ArrayList<Person>();
            listOfPerson.add(new Person("Rajeev"));
            listOfPerson.add(new Person("Rajeev"));
            listOfPerson.add(new Person("Rajeev"));
            
        
            List<Customer> listOfCustomer=new ArrayList<Customer>();
            listOfPerson.add(new Customer("Rajeev"));
            listOfPerson.add(new Customer("Rajeev"));
            listOfPerson.add(new Customer("Rajeev"));
            
            iteratePersonList(listOfPerson);;
            iteratePersonList2(listOfCustomer);
           

	}

  // this shows cast iron guarantee. 
	// you can assign here any type which is sub type of List<Person>
	// Sub typing principle. 
	//ArrayList<Person> is a sub type of List<Person>   -- Ok
  	//LinkedList<Person> is a sub type fo List<Person>  -- Ok. 
// List<Customer> is a not sub type of List<Person>  -- no ok because List<Customer> is not a sub type of List of Person. 
 	
 
	
	// List<person> is sub type of Collection<Person>
	
	
	public static void iteratePersonList(List<Person> personListS){
		
		for (Person person : personListS) {
			System.out.println(person.getName());
		}
	}

	//now quizzical phrase comes into picture. 
	public static void iteratePersonList2(List<? extends Person> personListS){
		
		
		//next principle . 
		
		  // Get principle followed by <? extends T >  says you can only get values can never put anything . 
		  
		  //Put principle followed by <? super T >  you cannt get anything excpetion you can put its child class object 
		
	//	personListS.add(new Person("dd")); // why ? 
		//personListS.add(new Customer("dd"));// why ? 
		
		personListS.add(null);
		
		for (Person person : personListS) {
			System.out.println(person.getName());
		}
	 
	    Person person=personListS.get(0);
	 
	}




}

