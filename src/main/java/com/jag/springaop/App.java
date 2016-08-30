package com.jag.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jag.springaop.customer.services.Student;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Spring-Student.xml" });

		
		Student student =(Student) appContext.getBean("studentProxy");
		
/*		CustomerService cust = (CustomerService) appContext
				.getBean("customerServiceProxy");*/

		System.out.println("*************************");
		student.printName();
		System.out.println("*************************");
		student.printID();
		System.out.println("*************************");
		try {
			student.printThrowException();
		} catch (Exception e) {

		}

	}
}
