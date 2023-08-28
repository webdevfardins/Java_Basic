package com.java.basic;

public class HelloWorld {

	public static void main(String[] args) {

	String name= "Fardin sheikh";
	System.out.println("Length"+name.length());
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.charAt(5));
	System.out.println(name.indexOf("a"));
	System.out.println(name.lastIndexOf("i"));
	System.out.println(name.replace("s", "a"));
	System.out.println(name.startsWith("Fardin"));
	System.out.println(name.substring(8));

	}

}
