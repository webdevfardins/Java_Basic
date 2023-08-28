package com.java.basic;


public class CommandlLine {

	public static void main(String[] args)throws Exception {
		int ab= System.in.read();
		System.out.println("Selected ASCII Code "+ab);
		if (ab=='A'||ab=='a'){
			Add.main(args);
		} else if(ab=='D'||ab=='d') {
			DateToday.main(args);
		} else{
			System.out.println("Incorrect choice");
	}
	}

}
