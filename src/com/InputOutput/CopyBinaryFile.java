package com.InputOutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBinaryFile   {

	public static void main(String[] args)throws Exception {
		String source = "c:/picture/f.jpg";
		String target = "c:/picture/Camera Roll/logo.jpg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = in.read();
		while (ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		in.close();
		out.close();
		System.out.println(source + " is copied to " + target);
	}

	
}


