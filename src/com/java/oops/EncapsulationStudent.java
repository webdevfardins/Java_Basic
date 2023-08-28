package com.java.oops;

public class EncapsulationStudent {
	private String studentName = null;
	private int rollNO = 0;
	private  static String collageName = "vikram";
	//getter and setter
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public static String getCollageName() {
		return collageName;
	}
	public static void setCollageName(String collageName) {
		EncapsulationStudent.collageName = collageName;
	}
	
			

}
