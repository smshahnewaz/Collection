package com.collection;
import java.util.Comparable;

public class EmpNameSorting implements Comparable<Emp>{
	int empid;
	String empname;
	float sal;

	public Emp(int empid, String empname, float sal ) {
		this.empid=empid;
		this.empname=empname;
		this.sal=sal;
		return;
	}
	@Override
	public String toSorting() {
		return; 
	}
}
