package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {
	public static void main(String[] args) {
		System.out.println("ArrayList program running");
		ArrayList al = new ArrayList();
		al.add("Akshay"); //string
		al.add("Arora"); //string
		al.add('A'); //char
		al.add(9876543210L); //long
		al.add(85.25); //float
		al.add("Pune"); //string
		al.add(54851); //int
		al.add(null); //string
		al.add(null); //string
		al.add(null); //string
		al.add(true);//boolean
		al.add("Akshay"); //string
		al.add("Arora"); //string
		System.out.println(al);
		
		al.add(3,"Aspire");
		System.out.println(al+",");
		
		al.remove(3);
		System.out.println(al+",");
		
		boolean a=al.contains("Akshay");
		System.out.println(a);
		
		al.set(4,21.03); //set=remove+add
		System.out.println(al);
		
		System.out.println(al.get(2));
		System.out.println(al.get(1));
		System.out.println(al.get(4));
		
		System.out.println("***Print all ArrayList by the for loop***");
		for(int i=0;i<=al.size()-1;i++) 
		{
			System.out.print(al.get(i)+",");
		}
		System.out.println("\n\n***Print all ArrayList by the forEach loop***");
		
		for(Object data:al) //(dataType dataElement:dataSource) 
		{
			System.out.print(data+",");
		}
		
		System.out.println("\n***Iterator Cursor***");
		
		Iterator itr = al.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
		
		System.out.println("\n***ListIterator Cursor***");
		// ListIterator will work in only List,and will not work in Set
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext()) 
		{
			System.out.print(litr.next()+",");
		}
		System.out.println();
	}
}
