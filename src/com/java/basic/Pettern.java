package com.java.basic;

public class Pettern {

	public static void main(String[] args) {
		int n =10;
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%2d",(i*j));
				System.out.println();
			}
		}

	}

}
