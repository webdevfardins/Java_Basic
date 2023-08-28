package com.java.basic;

public class Returnmathod {

	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		double Div = getDivision(a,b);
		System.out.println("division is "+ Div);
		
	}
	public static double getDivision(int a , int b) {
		double div= a/b;
		return div;
	}
}
