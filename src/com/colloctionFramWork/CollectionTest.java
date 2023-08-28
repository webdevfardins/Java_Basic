package com.colloctionFramWork;
import java.util.*;
public class CollectionTest {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Fardin Ahmed Sheikh");
		a1.add(56);
		a1.add("Nisar ahmed sheikh");
		
		System.out.println(a1.add("Parveen"));
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add("norin");
		a2.add("noshin");
		a2.add("Shirin");
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a1.contains("Parveen"));
		System.out.println(a1.containsAll(a2));
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		a2.clear();
		System.out.println(a2);
		a1.remove(0);
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println(a1);
	}

}
