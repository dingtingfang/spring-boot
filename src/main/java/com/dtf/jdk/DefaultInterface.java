package com.dtf.jdk;

public class DefaultInterface {

	public interface vehicle {
		default void print() {
			System.out.println("我是一辆车!");
		}
	}

	public interface fourWheeler {
		default void print() {
			System.out.println("我是一辆四轮车!");
		}
	}
	
	public class car implements vehicle, fourWheeler {
		  
	}
}
