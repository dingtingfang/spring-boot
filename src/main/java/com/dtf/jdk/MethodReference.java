package com.dtf.test;

import java.util.Arrays;
import java.util.List;

import com.dtf.test.model.Car;

/**
 * 1.方法引用通过方法的名字来指向一个方法。
 * 2.方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
 * 3.方法引用使用一对冒号(::)。
 * 
 * */
public class MethodReference {
	
	public static void main(String[] args) {
		//构造器引用：它的语法是Class::new，或者更一般的Class< T >::new
		final Car car = Car.create( Car::new );
		final List< Car > cars = Arrays.asList( car );
	}
}
