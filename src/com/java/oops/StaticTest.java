package com.java.oops;

public class StaticTest {
	
	void display() {
		System.out.println("this is a non-static method");
		
	}
	static void Show() {
		System.out.println("this is a static method");
		
	}
	public static void main(String[] args) {
		StaticTest t = new StaticTest();
		 t.display();
		 StaticTest.Show();
		 Show();
	}
}
