package com.java.oops;

public class StaticVariable {
	private  String Name;
	private int RollNo;
	private static String Univercity = "Davv"; 

	
	StaticVariable(int r,String n){
		RollNo=r;
		Name= n;
		
	}
	public void Display() {
		System.out.println(RollNo+" "+Name+" "+Univercity);
	}

	public static void main(String[] args) {
		StaticVariable s1=new StaticVariable(100,"Fardin");
		StaticVariable s2=new StaticVariable(101,"Irshad");
		StaticVariable s3=new StaticVariable(102,"Jafer ");
		StaticVariable s4=new StaticVariable(103,"Shadab");
		StaticVariable s5=new StaticVariable(104,"Sharik");
		StaticVariable s6=new StaticVariable(105,"Parvez");
		
		s1.Display();
		s2.Display();
		s3.Display();
		s4.Display();
		s5.Display();
		s6.Display();
	}

}
