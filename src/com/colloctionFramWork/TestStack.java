package com.colloctionFramWork;
import java.util.*;

public class TestStack {

	public static void main(String[] args) {
	Stack s =new Stack();
	 s.push(10);
	 s.push(20);
	 s.push(5);
	 s.push(8);
	 s.push(7);
	 
	 System.out.println("All Stack Are :"+s);
	  
	 System.out.println(s.pop());
	 System.out.println(s.pop());
	 System.out.println(s);

	}

}
