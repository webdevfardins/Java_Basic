package com.java.oops;

public class B  extends A{
	int i=20;
	void Show(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		
	}

	public static void main(String[] args) {
		B ob1=new B();
		ob1.Show(30);

	}
}


