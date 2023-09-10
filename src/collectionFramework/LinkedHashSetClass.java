package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		System.out.println("LinkedHashSet program running");
		lhs.add("Akshay"); //string
		lhs.add("Arora"); //string
		lhs.add('A'); //char
		lhs.add(9876543210L); //long
		lhs.add(85.25); //float
		lhs.add("Pune"); //string
		lhs.add(54851); //int
		lhs.add(null); //string
		lhs.add(null); //string
		lhs.add(null); //string
		lhs.add(true);//boolean
		lhs.add("Akshay"); //string
		lhs.add("Arora"); //string
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		System.out.println(lhs.contains("Pune"));
		lhs.remove('A');
		System.out.println(lhs);
		System.out.println(lhs.size());
		
		for(Object temp:lhs) 
		{
			System.out.print(temp+",");
		}
		
		System.out.println("\n***Iterator Cursor***");
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
		
		//Listiterator will not work in LinkedHashSet
	}
	
}
