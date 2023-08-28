package com.java.oops;

public class Main {
	  private String languages;
	  
	  public Main(String lang) {
		  languages = lang ;
		  System.out.println(languages +" Programming language" );
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj1=new Main("java");
		Main obj2=new Main("c,"
				+ "c++");
		Main obj3=new Main("python");

	}

}
