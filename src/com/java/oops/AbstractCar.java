package com.java.oops;

public class AbstractCar extends AbstractVehicle{
		 
		 void start() {
			System.out.println("start with key"); 
		 }
		 void speed() {
			 System.out.println("high speed is 150");
		 }
	 
	public static void main(String[] args) {
		AbstractCar c =new AbstractCar();
		c.start();
		c.speed();
		AbstractVehicle	 v = new AbstractCar();
		v.speed();
		v.start();
	}

}
