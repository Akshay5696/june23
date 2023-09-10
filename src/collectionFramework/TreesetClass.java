package collectionFramework;
import java.util.Iterator;
//store only homogenous data (1st data we'll add be preset automatic datatype)
//dosent allow duplicate value
//null values are not allowed
import java.util.TreeSet;
public class TreesetClass {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("Akshay"); //string
		ts.add("Arora"); //string
		ts.add("ATIPUNE"); //string
		ts.add("Aspire"); //string
		ts.add("Training"); //string
		ts.add("Pune"); //string
		ts.add("Institute"); //string
//		ts.add(null); //string
//		ts.add(null); //string
//		ts.add(null); //string
//		ts.add(true);//boolean
		ts.add("Akshay"); //string
		ts.add("Arora"); //string
		
		System.out.println(ts.contains("Akshay"));
		
		System.out.println(ts);
		System.out.println(ts.size());
		
		ts.remove("Training");
		System.out.println(ts);
		System.out.println(ts.size());
		
		System.out.println(ts.isEmpty());
		
		System.out.println("\n***Iterator Cursor***");
		Iterator itr = ts.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
		
		//ListIterator will not work in TreeSet
	}
}
