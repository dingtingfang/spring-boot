package com.dtf.spring.ch3.wiselyConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		DemoService demoService = context.getBean(DemoService.class);
		demoService.outputResult();
		context.close();
	}

}
