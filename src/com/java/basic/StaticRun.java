
package com.java.basic;

public class StaticRun {

	static int a =50;
	static	int b;
	static	int max;
	
	static {
		System.out.println("first static block");
		b = a * 4;
		
	}
	static {
		
		System.out.println("second static block");
		max= 60;
	}
	static void display() {
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("max = "+ max);
	}
	public static void main(String args[]) {
		StaticRun.display();
	}
	}

