package com.InputOutput;
import java.io.File;

public class FilesAndDirectory {

	public static void main(String[] args) {
		File directory = new File("C:/sonu");
		String []List= directory.list();
		for(int i=0;i<List.length;i++) {
			System.out.println((i+1)+": "+List[i]);
			
		}
		

	}

}
