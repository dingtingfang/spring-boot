package com.dtf.spring.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	@Autowired
	ApplicationContext applicationContext;
	
	public void publisher(String msg){
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
