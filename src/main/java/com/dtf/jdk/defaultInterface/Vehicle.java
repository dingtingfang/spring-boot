package com.dtf.jdk.defaultInterface;


public interface Vehicle {
	default void print() {
		System.out.println("我是一辆车!");
	}
}
