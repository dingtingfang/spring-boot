package com.dtf.spring.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{
	
	private static final long serialVersionUID = -8801751514488488680L;
	private String msg;
	
	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
