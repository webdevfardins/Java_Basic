package com.InputOutput;
import java.io.File;
import java.util.Date;
public class FileAttribute {

	public static void main(String[] args) {
		File f= new File("C:/sonu/s.txt");
		if(f.exists()) {
			System.out.println("name "+f.getName());
			System.out.println("Atribute PAth "+ f.getAbsolutePath());
			System.out.println("id Writable "+f.canWrite());
			System.out.println("is readable "+f.canRead());
			System.out.println("is file "+f.isFile());
			System.out.println("is Directory"+f.isDirectory());
			System.out.println("Last Modified at " + new Date(f.lastModified()));
			System.out.println("Length "+f.length());
			
		} else {
			System.out.println("file does not exits");
		}

	}

}
