package com.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.spring.test2" )
public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);
		context.scan("com.spring.test");
		//context.refresh();
		
		MathComponent mathComponent = (MathComponent) context.getBean("mc");
		System.out.println(mathComponent.add(1, 3));
		
		context.close();
	}
}
