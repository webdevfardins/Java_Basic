package com.colloctionFramWork;
import java.util.ArrayList;

public class ArrayLIst3 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Aftab");
		a.add("fardin");
		a.add(20);
		a.add(1, "moin");
		System.out.println(a);
		a.add("sonu");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.set(0, "saurabh");
		a.clear();
		System.out.println(a);
	
		
		
		

	}

}
