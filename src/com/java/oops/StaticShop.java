package com.java.oops;

public class StaticShop {
	private  String Name;
	private int Empid;
	private static String Company = "MandsaurIron";
	 
	StaticShop(String Name,int Empid){
		this.Name=Name;
		this.Empid=Empid;
		
	}
	void display() {
		System.out.println(Name+" "+Empid+" "+Company);
	}
	public static void main(String[] args) {
		StaticShop e1=new StaticShop("Fardin",101);
		e1.display();
		StaticShop e2=new StaticShop("Aftab",102);
		e2.display();
	}
}