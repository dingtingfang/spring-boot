package com.dtf.spring.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
	
	/**
	 * 通过@Conditional 注解，符合WindowsCondition条件的才能被实例化
	 * 
	 * */
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService WindowsListService(){
		return new WindowsListService();
	}
	
	/**
	 * 通过@Conditional 注解，符合LinuxCondition条件的才能被实例化
	 * 
	 * */
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService LinuxListService(){
		return new LinuxListService();
	}
}
