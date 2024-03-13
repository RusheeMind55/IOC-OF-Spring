package com.jbk.MainClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jbk.employee;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("welcome to Spring");

		ApplicationContext context=new  ClassPathXmlApplicationContext("springbeans.xml");

	employee e=(employee) context.getBean("emp");
//type cast second type 
//employee e= context.getBean("emp",employee.class);
		
		System.out.println(e);
	}

}
