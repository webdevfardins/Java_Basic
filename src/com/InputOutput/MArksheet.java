package com.InputOutput;

import java.io.Serializable;

public class MArksheet implements Serializable{
	public String name = null;
	public int maths = 0;
	public int physics = 0;
	public int chemistry = 0;
	private transient int total = 0;
	private transient double percentage = 0;

	
	public int getTotal() {
		total = maths + physics + chemistry;
		return total;
	}

	
	public double getPercentage() {
		percentage = total / 3;
		return percentage;
	}
}

