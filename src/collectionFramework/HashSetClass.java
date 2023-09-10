package collectionFramework;
//in HashSet we can only use those methods which are not related to index 
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetClass {
	public static void main(String[] args) {
		System.out.println("HashSet program running");
		HashSet hs = new HashSet();
		hs.add("Akshay"); //string
		hs.add("Arora"); //string
		hs.add('A'); //char
		hs.add(9876543210L); //long
		hs.add(85.25); //float
		hs.add("Pune"); //string
		hs.add(54851); //int
		hs.add(null); //string
		hs.add(null); //string
		hs.add(null); //string
		hs.add(true);//boolean
		hs.add("Akshay"); //string
		hs.add("Arora"); //string
		//we can use .add(); only for single parameterised coz related to index
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.print(hs.contains('A')+"\n");
		
		//cant use .set(); coz related to index
		
	
		
		hs.remove('A');
		System.out.println(hs);
		System.out.println(hs.size());
		
// cant use .get(); in HashSet coz get method fetch index wise data and we cant use index here
// index are not useful bcoz o/p print randomly so no use of index		
//inside for loop we use .get(); bt here we cant use .get(); 
		//hence also we cant use for loop
		
		//we can use ForEach loop
		System.out.println("\n***ForEach loop***");
		for(Object temp:hs) 
		{
			System.out.print(temp+",");
		}
		
		System.out.println("\n***Iterator Cursor***");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
		
		//ListIterator will not work in HashSet
		
		
		
	}
}
