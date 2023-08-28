package com.java.oops;

public class StaticMathodClass {
	int Multyply(int a , int b) {
	return a *b;
	}
	static int Add(int a , int b) {
		return a + b;
	}
	   public static void main( String[] args ) {
		   StaticMathodClass fs=new StaticMathodClass();
		  System.out.println("15*20 = "+ fs.Multyply(15, 20));
		  
		  System.out.println("25+35 = "+StaticMathodClass.Add(25, 35));
	   }
}