package com.java.oops;

public class OverLoadingStudent {
	

		
		static String name()
		{
			return "Default" ;
			}  
		
		static String name(String firstName)
		{
			return firstName;
			}  
		
		static String name(String firstName,String lastName)
		{
			return firstName+lastName;
			}  
		static String name(String firstName,String lastName, int pincode)
		{
			return firstName+lastName+pincode;
			}  
		public static void main(String[] args){  
			System.out.println(OverLoadingStudent.name());
			System.out.println(OverLoadingStudent.name("Fardin"));
			System.out.println(OverLoadingStudent.name("Fardin ","Sheikh"));  
			System.out.println(OverLoadingStudent.name("Irshad ","Ali ",458001));
			
			}



}
