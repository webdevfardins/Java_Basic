package com.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class objOutputstream {
	public static void main(String[] args) throws IOException {

		// Open file
		FileOutputStream file = new FileOutputStream("c:/sonu/s.txt");

		// Create ObjectOutputStream
		ObjectOutputStream out = new ObjectOutputStream(file);

		// Create serialized marksheet object
		MArksheet m = new MArksheet();
		m.name = "param";
		m.physics = 89;
		m.chemistry = 99;
		m.maths = 95;

		// Write an object

		out.writeObject(m);

		// Close streams
		out.close();
		file.close();
	}


}
