package com.java.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

	public static void main(String[] args) {
    SimpleDateFormat date= new SimpleDateFormat(" E ,hh:mm"
    		+ " YYYY/MM/dd");
    String dat = date.format(new Date());
    System.out.println("Today Date Is "+ dat);
	}

}
