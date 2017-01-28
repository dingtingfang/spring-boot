package com.dtf.jdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.dtf.jdk.model.Car;

/**
 * 1.方法引用通过方法的名字来指向一个方法。
 * 2.方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
 * 3.方法引用使用一对冒号(::)。
 * 
 * */
public class MethodReference {
	
	public static void main(String[] args) {
		//构造器引用：它的语法是Class::new，或者更一般的Class< T >::new
		/**
		 * 构造器引用:构造方法中使用 Supplier< Car > supplier
		 * */
		final Car car = Car.create( Car::new );
		final Car car1 = Car.create( Car::new );
		final Car car2 = Car.create( Car::new );
		final List< Car > cars = Arrays.asList( car,car1,car2);
		//final List< Car > cars = Arrays.asList(new Car());
		
		System.out.println(cars.size());
		
		//静态方法引用：它的语法是Class::static_method，实例如下：
		cars.forEach(Car::collide);
		
		//特定类的任意对象的方法引用：它的语法是Class::method实例如下：
		cars.forEach( Car::repair );
		
		//特定对象的方法引用：它的语法是instance::method实例如下：
		/**
		 * 使用police的follow方法输出car对象（cars）
		 * 
		 * */
		final Car police = Car.create( Car::new );
		cars.forEach( police::follow );
		
		//police.collide(police);
		
		
		//方法引用实例
		List names = new ArrayList();
		names.add("Google");
		names.add("Runoob");
		names.add("Taobao");
		names.add("Baidu");
		names.add("Sina");
		names.forEach(System.out::println);
	}
}
