package com.dtf.spring.ch3.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
		ScheduledTaskServer scheduledTaskServer = context.getBean(ScheduledTaskServer.class);
	}

}
