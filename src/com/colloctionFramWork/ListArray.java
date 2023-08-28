package com.colloctionFramWork;
 import java.util.*;
public class ListArray {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Atik");
		l.add("Monu");
		l.add("Nmeera");
		l.add("Tahera");
		l.add(3, 3);
		l.add(null);
		l.add(null);
		
		Iterator it= l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(3);
		s.add(null);
		s.add(null);
		System.out.println(s);

	}

}
