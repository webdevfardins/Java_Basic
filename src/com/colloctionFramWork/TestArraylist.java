package com.colloctionFramWork;
import java.util.ArrayList;
public class TestArraylist {
	public static void main(String[] args) {
		
	
		ArrayList c = new ArrayList();
		c.add(5);
		c.add(2);
		c.add(7);
		c.add(9);
		c.add(3);
		c.add(3);
		
		System.out.println("size"+c.size());
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		System.out.println(c.get(4));
		System.out.println(c.get(5));
		
		int ind = c.indexOf(3);
		System.out.println("Index " + ind);
	}


}
