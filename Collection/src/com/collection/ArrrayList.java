package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrrayList {

	public static void main(String [] args) {
		
		ArrayList obj = new ArrayList();
		
		System.out.println("Array size : "+obj.size());
		System.out.println(obj);
	
		obj.add("Ron");
		obj.add("Wisely");
		obj.add("Safri");
		obj.add("Nahid");
		obj.add(450);
		obj.add(550);
		obj.add(650);
		obj.add(850);
			
		//displaying elements 
		System.out.println("Array size : "+obj.size());
		System.out.println(obj);

		// Removing elemetns from array
		System.out.println("\nRemove element(s): ");
		obj.remove(5);
		System.out.println("Array size : "+obj.size());
		System.out.println(obj);
		
		// Replace item
		System.out.println("\nReplace element(s): ");
		obj.set(2, "Priyanka");
		obj.set(3, "Priyo");
		System.out.println(obj);
		
		System.out.println("\nCehck Availability: ");
		System.out.println("Availability (Safri)  :"+obj.contains("Safri"));
		System.out.println(obj);
		
		Iterator itr=obj.iterator();
		System.out.println("\nIterate the array: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}
}
