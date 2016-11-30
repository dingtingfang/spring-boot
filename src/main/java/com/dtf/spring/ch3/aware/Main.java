package com.dtf.spring.ch3.aware;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		context.close();
		
		BeanFactory bf = BeanFactoryHelper.getBeanfactory();//获取工厂
		AwareService aw = (AwareService) bf.getBean("awareService");//通过BEAN名称取BEAN
		aw.outputResult();
	}
}
