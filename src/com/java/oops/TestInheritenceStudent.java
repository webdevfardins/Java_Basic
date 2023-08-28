package com.java.oops;

public class TestInheritenceStudent extends  InheritenceStudent {
	
	public void notification() {
		System.out.println("get notificatiom from school");
		
		 
		 
		 
	}
	 
	

	public static void main(String[] args) {
		InheritenceStudent InheritenceStudent = new TestInheritenceStudent();
		 
		
		InheritenceStudent.school();
		
		 
	}
}
