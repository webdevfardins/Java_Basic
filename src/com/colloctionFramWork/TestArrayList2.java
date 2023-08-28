package com.colloctionFramWork;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		c.add(10);
		c.add(20.5);
		c.add("fardin");
		c.add(true);

		System.out.println("Collection is" + c.toString());

		int i = (int) c.get(0);
		double d = (double) c.get(1);
		String s = (String) c.get(2);

		System.out.println(i);
		System.out.println(d);
		System.out.println(s);

		boolean b = c.contains("fardin");
		System.out.println(b);

		
		int ind = c.indexOf("Shoaib");
		System.out.println("Index of Shoaib " + ind);

		
		c.set(2, "Faisal");

		// Remove an element
		String r = (String) c.remove(2);
		System.out.println(r);

		// Get all elements
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
