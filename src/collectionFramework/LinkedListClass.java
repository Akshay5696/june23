package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
	public static void main(String[] args) {
		System.out.println("ArrayList program running");
		LinkedList ll = new LinkedList();
		ll.add("Akshay"); //string
		ll.add("Arora"); //string
		ll.add('A'); //char
		ll.add(9876543210L); //long
		ll.add(85.25); //float
		ll.add("Pune"); //string
		ll.add(54851); //int
		ll.add(null); //string
		ll.add(null); //string
		ll.add(null); //string
		ll.add(true);//boolean
		ll.add("Akshay"); //string
		ll.add("Arora"); //string
		System.out.println(ll);
		
		ll.add(3,"Aspire");
		System.out.println(ll+",");
		
		ll.remove(3);
		System.out.println(ll+",");
		
		boolean a=ll.contains("Akshay");
		System.out.println(a);
		
		ll.set(4,21.03); //set=remove+add
		System.out.println(ll);
		
		System.out.println(ll.get(2));
		System.out.println(ll.get(1));
		System.out.println(ll.get(4));
		
		System.out.println("Print all ArrayList by the for loop");
		for(int i=0;i<=ll.size()-1;i++) 
		{
			System.out.print(ll.get(i)+",");
		}
		System.out.println("\n\nPrint all LinkedList by the forEach loop");
		
		for(Object data:ll) //(dataType dataElement:dataSource) 
		{
			System.out.print(data+",");
		}
		
		System.out.println("\n***Iterator Cursor***");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
		
		System.out.println("\n***ListIterator Cursor***");
		ListIterator litr = ll.listIterator();
		
		while(litr.hasNext()) 
		{
			System.out.print(litr.next()+",");
		}
		System.out.println();
	}
}
