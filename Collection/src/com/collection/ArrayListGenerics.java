package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListGenerics {

	public static void main(String[] args) {
		// Creating 1st Generic 
		ArrayList<String> pname=new ArrayList<String>();
		System.out.println("\n");
		System.out.println("::::::: PC RICHARD & SON :::::::");
		System.out.println("\n");
		pname.add("TV");
		pname.add("AC");
		pname.add("Bike");
		System.out.println("Arralist 1:  ");
		System.out.println(pname);
		
		// Creating 2nd Generic 
		ArrayList<String> catagory=new ArrayList<String>();
		catagory.add("Furniture");
		catagory.add("Clothes");
		catagory.add("Jewelery");
		System.out.println("\nArralist 2:  ");
		System.out.println(catagory);
		
		System.out.println("\n::::::Operations With ArrayList:::::");
		// Merge 
		System.out.println("\nMerge :");
		pname.addAll(catagory);
		System.out.println(pname);
		
		// Sort
		Collections.sort(pname);
		System.out.println("\nSorted (Alphabetically): ");
		System.out.println(pname);
		
		// Reverse
		Collections.reverse(pname);
		System.out.println("\nReverse:  "  );
		System.out.println(pname);
		
		// retrieve using for loop 

		System.out.println("\nFor Looping:");
		for(String obj:pname) {
			System.out.println(obj);
		}
		// Iterator
		System.out.println("\nIterator(Forward & Backward):");
		ListIterator obj=pname.listIterator();
		System.out.println("\nForward:");
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println("\nBackward:");
		while(obj.hasPrevious()) {
			System.out.println(obj.previous());
		}
	}
}
