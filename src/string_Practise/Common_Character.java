package string_Practise;

import java.util.Iterator;

public class Common_Character {
	public static void main(String[] args) {
		String s1 = "akshay";
		String s2 = "arora";
		
		for(int i=0; i<s1.length(); i++) 
		{
			char ch = s1.charAt(i);
			if(s2.contains(String.valueOf(ch))) 
			{
//				System.out.print(ch+",");
				System.out.print(Character.toUpperCase(ch)+",");
			}
		}
	}
}
