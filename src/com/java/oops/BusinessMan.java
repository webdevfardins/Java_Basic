package com.java.oops;
public class BusinessMan implements interfaceRichMen, interfaceSocailWorker{
	

	public void donation() {
		System.out.println("Giving Donation");
	}

	public void earnMony() {
		System.out.println("Earning Money");
	}

	public void party() {
		System.out.println("Doing Party");
	}

	public void helpToOthers() {
		System.out.println("Helping to Others");
	}

public static void main(String[] args) {
		
	interfaceRichMen rm = new BusinessMan();
		rm.donation();
		
		interfaceSocailWorker sw = new BusinessMan();
		sw.helpToOthers();
		
		BusinessMan bm = new BusinessMan();
		bm.donation();
		bm.earnMony();
		bm.helpToOthers();
		bm.party();

	}

}
