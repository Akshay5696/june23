package LogicalPrograms;

import java.util.LinkedHashSet;

//output-[10,13,12,55,66,11]
public class Duplicate {
	public static void main(String[] args) {
		int[] a= {10,10,13,12,12,10,55,66,55,11};
		//array-->set-->hashset/linkedhashset/treeset
		LinkedHashSet lhs = new LinkedHashSet();
		for(int i=0;i<a.length;i++) 
		{
			lhs.add(a[i]);
		}
		System.out.println(lhs);
	}
}
