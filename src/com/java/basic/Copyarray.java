package com.java.basic;

public class Copyarray {

	public static void main(String[] args) {
		char [] copyfrom= {'d','e','f','i','f','a','r','d','i','n','o','e','j','n','i','z'};
		char [] copyTo= new char[9];
		System.arraycopy(copyfrom, 3, copyTo, 0, 9);
		System.out.println(new String(copyTo));

	}

}
