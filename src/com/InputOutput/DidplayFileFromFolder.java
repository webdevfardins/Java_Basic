package com.InputOutput;

import java.io.File;

public class DidplayFileFromFolder {
	public static void main(String[] args) {
		
	

	File directory = new File("c:/sonu");
	System.out.println("dire "+directory); 
	
	String [] list = directory.list();
	
	for(int i=0;i<list.length;i++) {
		
		File f = new File("c:/sonu/s.txt");
		if(f.isFile()) {
			System.out.println((i+1)+":" +list[i]);
		}else {
			System.out.println("File not found");
		}
	}
	
	}
}

