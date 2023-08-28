package com.colloctionFramWork;
import java.util.*;
public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> a1= new TreeSet();
		a1.add("Irshad");
		a1.add("Shadab");
		a1.add("Sharik");
		a1.add("Parvej");
		a1.add("Jafar");
		
		Iterator<String> i =a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
