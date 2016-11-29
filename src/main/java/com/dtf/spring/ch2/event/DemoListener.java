package com.dtf.spring.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我(bean-demoListener)接收到了bean-demoPlublistenr 发布的消息"+msg);
		
	}

}
