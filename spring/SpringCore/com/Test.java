package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext  factory = new ClassPathXmlApplicationContext("SpringConfig.xml");
	
	System.out.println(factory.getBean("emp"));
	
	System.out.println(factory.getBean("emp1"));
	
	
	}

}
