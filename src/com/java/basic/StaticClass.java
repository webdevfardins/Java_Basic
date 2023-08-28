package com.java.basic;

public class StaticClass {
	int sub(int a, int b) {
		return a-b;
	}
	static int div(int a , int b) {
		return a/b;
	}

	public static void main(String[] args) {
		StaticClass fb = new StaticClass();
		System.out.println("20 - 10 =" +fb.sub(20,10));
		System.out.println("100 / 50 = "+StaticClass.div(100, 50));
		
	}

}
