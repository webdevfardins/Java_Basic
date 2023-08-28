package com.colloctionFramWork;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("RO4", "fardin");
		map.put("RO3", "shirin");
		map.put("RO2", "Norin");
		map.put("RO1", "Noshin");
		
		
		System.out.println("RO3 :");
		System.out.println(map.get("RO3"));
		
		Set Keys = map.keySet();
		Iterator i = Keys.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collection vals = map.values();
		Iterator it = vals.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
