package com.dtf.spring.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		
		ListService listService = context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")+"系统命令如下:"+listService.showList());

	}

}
