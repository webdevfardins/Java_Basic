package com.java.basic;

public class AddArgsCls {
	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int sum=a+b;
		System.out.println("sum is "+sum);
}
}