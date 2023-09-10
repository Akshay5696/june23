package collectionFramework;

import java.util.HashMap;

public class MapClass {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Akshay"); //.put()-->for add data
		hm.put(2, "Rakesh");
		hm.put(3, "Pratik");
		System.out.println(hm);
		hm.put(3, "Bunty"); //duplicate key are not allowed
		hm.put(4, "Rakesh");//duplicate value are allowed
		System.out.println(hm);
		
		System.out.println(hm.get(4)); // to get data from Hashmap
		System.out.println(hm.get(3));
		
		System.out.println(hm.size());
		
		System.out.println(hm.containsKey(3));
		
		System.out.println(hm.containsValue("Bunty"));
		
		System.out.println("***For loop***");
		for(int i=1;i<=hm.size();i++) 
		{
			System.out.print(hm.get(i)+",");
		}
	}
}
