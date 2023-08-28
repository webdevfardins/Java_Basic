package com.java.oops;

public class AbstractLoin extends AbstractAnimal{

	void Run() {
		System.out.println("loin is Running Fast");
		
	}
	public static void main(String[] args) {
		AbstractLoin l = new AbstractLoin();
		l.eat();
		l.Run();
	}

}
