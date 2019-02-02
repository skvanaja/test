package com.springcoreprograms.maven.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	
	public static void main(String args[])
	{
		//ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcoreprograms/maven/springcore/config.xml");
		Employee e=(Employee)context.getBean("emp");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e);
	}

}
