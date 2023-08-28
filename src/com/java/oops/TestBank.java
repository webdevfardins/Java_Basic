package com.java.oops;

public class TestBank {
	public static void main(String[] args) {
		OverridingRBIBank r =new OverridingRBIBank();
		Over_SBI s= new Over_SBI();
		Over_axis a= new Over_axis();
		Over_icici i = new Over_icici();
		
		System.out.println("RBi Rate of interest: "+r.getRateOfInterest());
		System.out.println("SBi Rate of interest: "+s.getRateOfInterest());
		System.out.println("AXIS Rate of interest: "+a.getRateOfInterest());
		System.out.println("ICICI Rate of interest: "+i.getRateOfInterest());
		
	}

}
