package com.InputOutput;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileFromJava {
public static void main(String[] args) throws IOException {
		
		FileReader in = new FileReader("c:/sonu/s.txt");
		int ch = in.read(); // read ASCII code
		char chr;
		if(ch==-1) {
			System.out.println("File me kuch bhi nahi likha hai");
		}
		// read character by character
		while (ch != -1) { // -1 is end of file
			chr = (char) ch;
			System.out.print(chr);
			ch = in.read();
		}
		in.close();
		
	}


}
