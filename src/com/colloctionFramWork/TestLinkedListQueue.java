package com.colloctionFramWork;
import java.util.LinkedList;
public class TestLinkedListQueue {

	public static void main(String[] args) {
		LinkedList l =new LinkedList();
		
		l.offer("Fardin");
		l.offer("Norin");
		l.offer("Noshin");
		l.offer("Shirin");
		
		System.out.println("Element  Of Queue" + l);
		String removedele = (String) l.remove();
        System.out.println("removed element-" + removedele);
		System.out.println(l.peek());
        
        System.out.println(l.poll());
        System.out.println(l.poll());
        System.out.println(l.poll());
	}

}
