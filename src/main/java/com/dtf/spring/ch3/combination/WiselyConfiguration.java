package com.dtf.spring.ch3.combination;

import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Target(ElementType.TYPE) // 类、接口（包括注释类型）或枚举声明
@Retention(RetentionPolicy.RUNTIME) //用@Retention(RetentionPolicy.RUNTIME )修饰的注解，表示注解的信息被保留在class文件(字节码文件)中当程序编译时，会被虚拟机保留在运行时，所以他们可以用反射的方式读取
@Documented
@Configuration //组合@Configuration 
@ComponentScan //组合@ComponentScan
public @interface WiselyConfiguration {
	public String[] value() default{};
}
