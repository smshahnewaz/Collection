package com.collection;
// building Student class to a add element using "ArrayList" Collection 
public class Student {
	// instance variables
	int sid;
	String name;
	float marks;
	// this is a constructor of class Student
	public Student(int sid, String sname, float marks) {
		this.sid=sid;
		this.marks=marks;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [sid= " +sid+", name: "+name+", marks: "+marks+" ]";
	}
}



