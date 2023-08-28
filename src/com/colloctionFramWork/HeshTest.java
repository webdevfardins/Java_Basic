package com.colloctionFramWork;
import java.util.HashSet;
import java.util.Iterator;
public class HeshTest {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		
		s.add("Nisar");
		s.add(10.5);
		s.add(10);
		s.add(true);
		s.add("Norin");
		s.add("Norin");
		
		System.out.println(s.contains("Norin"));
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
