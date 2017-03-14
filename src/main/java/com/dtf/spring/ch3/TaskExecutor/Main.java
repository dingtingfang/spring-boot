package com.dtf.spring.ch3.TaskExecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsycTaskService asycTaskService = context.getBean(AsycTaskService.class);
		
		for(int i = 0; i < 10 ; i++){
			asycTaskService.executeAsycTask(i);
			asycTaskService.executeAsycTaskPlus(i);
		}
		context.close();
	}

}
