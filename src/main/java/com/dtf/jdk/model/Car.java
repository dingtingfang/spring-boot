package com.dtf.jdk.model;

import java.util.function.Supplier;

import com.dtf.jdk.defaultInterface.FourWheeler;
import com.dtf.jdk.defaultInterface.Vehicle;

public class Car implements Vehicle,FourWheeler{
	
	private Integer id;
	
	private String name;
	
    public static Car create( final Supplier< Car > supplier ) {
        return supplier.get();
    }              
        
    public static void collide( final Car car ) {
        System.out.println( "Collided " + car.toString() );
    }
        
    public void follow( final Car another ) {
        System.out.println( "Following the " + another.toString() );
    }
        
    public void repair() {   
        System.out.println( "Repaired " + this.toString() );
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Vehicle.super.print();
	}
}
