package com.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object construction done by developer
		
		/*Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("John Wtson");
		eRef.setEaddress("Redwood shores");
	System.out.println("Employee details:"+ eRef);	*/
	}

	// Spring way | IOC(Inversion of control)
	//Resource is like an interface from spring package
	
	//Resource resource = new ClassPathResource("employeebean.xml");
	//BeanFactory factory = new XmlBeanFactory(resource); //Spring container which shall parse XML file and construct object
	
	//Employee e1 = (Employee)factory.getBean("emp1");// typecasting to employee type
	//Employee e2 = factory.getBean("emp2",Employee.class);//Passing employee.class type as an argument(another way of getting reference to the object)
	
	// IOC using Application context
	
	ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
	
	//Employee e1 = (Employee)context.getBean("emp1");// typecasting to employee type
	//getBean returns the object of the object so it has to be type casted to class.
	//Employee e2 = context.getBean("emp2",Employee.class);//Passing employee.class type as an argument(another way of getting reference to the object)

	
	
	//System.out.println("Employee1 Details:"+e1);
	//System.out.println("Employee2 Details:"+e2);
	
	ClassPathXmlApplicationContext cxt = (ClassPathApplicationContext)context;
	cxt.close();// close the context
}
