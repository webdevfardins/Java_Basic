package com.java.oops;

public class TestEncapsulationStudent {

	public static void main(String[] args) {
		
		EncapsulationStudent s1= new EncapsulationStudent();
		
		s1.setStudentName("Arif");
		s1.setRollNO(4);
		s1.setCollageName("MIT");
		
		System.out.println(s1.getStudentName());
		System.out.println(s1.getRollNO());
		System.out.println(s1.getCollageName());
		
		
		
		

	}

}
