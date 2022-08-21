package com.collection;
import java.util.HashMap;
public class HashMapCode {
	public static void main(String[] args) {
		HashMap<Integer, String> obj=new HashMap<>();
		obj.put(1,"Laptop");
		obj.put(2,"iPhone");
		obj.put(1,"Laptop");
		obj.put(0,null);
		obj.put(5,null);
		obj.put(4,"Headphone");
		obj.put(4,"AC");
		// print statement
		System.out.println(obj);
		System.out.println(obj.get(4));
		System.out.println();
	}
}
