package com.dtf.spring.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/*
 * implements Condition 重写，并写出实例化bean的条件
 */
public class LinuxCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.out.println(context.getEnvironment().getProperty("os.name").contains("Linux"));
		return context.getEnvironment().getProperty("os.name").contains("Linux");
	}

}
