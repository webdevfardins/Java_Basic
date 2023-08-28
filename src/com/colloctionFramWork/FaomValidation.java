package com.colloctionFramWork;
import java.util.Scanner;

public class FaomValidation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = s.nextLine();
		System.out.println("Enter Your Email");
		String email= s.nextLine();
		if(name.isEmpty()|| email.isEmpty()){
			System.out.println("please fill in all fields..");
		} else if(!email.contains("@")) {
			System.out.println("invalid Email...");
			
		} else {
			System.out.println("foam Submited Succesfully");
		}

	}

}
