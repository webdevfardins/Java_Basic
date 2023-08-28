package com.java.basic;

public class Call {

	public static void main(String[] args) {
		int ring=0;
		boolean pickup=true;
		while(pickup==false) {
			System.out.println("ringing"+ring);
			ring++;
			if(ring>10) {
				pickup=true;
			}
		} 
		
		System.out.println("You have a missed call");
	}

}
