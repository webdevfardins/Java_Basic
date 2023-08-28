package com.java.oops;

public class ContructorStudent {
private String studentName=null;
private int studentRollNo=0;

public ContructorStudent() {
	System.out.println("This is Default constructor");
	
}
public ContructorStudent(String name) {
	
	System.out.println("passed One pram "+ name+ " in ContructorStudent ");
}

public ContructorStudent(String studentName, int studentRollNo) {
	System.out.println("you Passed Two pram in constructor:  Name is "+ studentName +" Roll No IS "+studentRollNo);
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	
	this.studentName = studentName;
}
public int getStudentRollNo() {
	return studentRollNo;
}
public void setStudentRollNo(int studentRollNo) {
	this.studentRollNo = studentRollNo;
}




}
