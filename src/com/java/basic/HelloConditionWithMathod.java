package com.java.basic;

public class HelloConditionWithMathod {

	public static void main(String[] args) {
		mymethod(args);

	}
	public static void mymethod(String[] args) {
		
		int size;
		size=args.length;
		if(size==0) {
			System.out.println("Usage : java HelloAll1 name1 name2 name3 .. ");
		} else {
			for(int i=0; i<size;i++) {
				System.out.println(i +1+ " = Hello "+ args[i]);
			}
		}


	}

}