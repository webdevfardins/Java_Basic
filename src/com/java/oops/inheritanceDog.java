package com.java.oops;

public class inheritanceDog extends InheritanceAnimal{

	public void dog() {
		System.out.println("burking...");	
	}
	public static void main(String[] args) {
		inheritanceDog d=new inheritanceDog();
		d.dog();
		d.eat();
	}
	
}
