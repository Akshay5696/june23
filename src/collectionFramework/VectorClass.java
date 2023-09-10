package collectionFramework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		System.out.println("ArrayList program running");
		Vector v = new Vector();
		v.add("Akshay"); //string
		v.add("Arora"); //string
		v.add('A'); //char
		v.add(9876543210L); //long
		v.add(85.25); //float
		v.add("Pune"); //string
		v.add(54851); //int
		v.add(null); //string
		v.add(null); //string
		v.add(null); //string
		v.add(true);//boolean
		v.add("Akshay"); //string
		v.add("Arora"); //string
		System.out.println(v);
		
		v.add(3,"Aspire");
		System.out.println(v+",");
		
		v.remove(3);
		System.out.println(v+",");
		
		boolean a=v.contains("Akshay");
		System.out.println(a);
		
		v.set(4,21.03); //set=remove+add
		System.out.println(v);
		
		System.out.println(v.get(2));
		System.out.println(v.get(1));
		System.out.println(v.get(4));
		
		System.out.println("Print all ArrayList by the for loop");
		for(int i=0;i<=v.size()-1;i++) 
		{
			System.out.print(v.get(i)+",");
		}
		System.out.println("\n\nPrint all Vector by the forEach loop");
		
		for(Object data:v) //(dataType dataElement:dataSource) 
		{
			System.out.print(data+",");
		}
		
		System.out.println("\n***Iterator Cursor***");
		Iterator itr = v.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
		
		System.out.println("\n***ListIterator Cursor***");
		ListIterator litr = v.listIterator();
		
		while(litr.hasNext()) 
		{
			System.out.print(litr.next()+",");
		}
		System.out.println();
	}
		

}
