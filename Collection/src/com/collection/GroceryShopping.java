package com.collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class GroceryShopping{

	public static void main(String[] args) {
		// creating a new list
		ArrayList<String> grocery = new ArrayList();
		// creating scannner class
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\tShopping List");
		System.out.println("=================");

		grocery.add("onion");
		grocery.add("banans");
		grocery.add("cucumber");
		grocery.add("sunflower oil");

		for(int i=0; i<grocery.size(); i++) {
			System.out.println(grocery.get(i));
		}
		
		 System.out.println("\nAdd New Item? "); 
		 System.out.println("1.Yes\t\t 2.No");
		 int yes_no=sc.nextInt();
		 if(yes_no==1) {
			 System.out.println("How Many Items ?: ");
			 int choice=sc.nextInt();
			 for(int i=1; i<=choice; i++) {
				System.out.print("Item Name : ");
				String s=sc.next();
				grocery.add(s);
		 }}else {
			 System.out.println("Proceed to Cehckout>>>>>");
		 }
		System.out.println("Updated Shopping List\n");
		for(int i=0; i<grocery.size(); i++) {
			System.out.println(grocery.get(i));
		}
		}
	}

	










