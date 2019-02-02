package com.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {
	
	public static void main(String[] args){
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/list/listConfig.xml");
		//ApplicationContext context= new ClassPathXmlApplicationContext("listConfig.xml");

		Hospital h = (Hospital)context.getBean("hospital");
		System.out.println(h.getName());
		System.out.println(h.getDepartments());
		System.out.println(h);
		
	}

}
