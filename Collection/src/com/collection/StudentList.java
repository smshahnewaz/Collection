package com.collection;
import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		//executing imported package "ArrayList" with Student object.
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(1432,"James",799));
		al.add(new Student(1431,"Tom",899));
		al.add(new Student(1444,"Joe",769));
		al.add(new Student(1422,"Hris",921));
		for(Student s1:al) {
			System.out.println(s1);
		}
		System.out.println("\nThanks for coming in!");
	}
}
