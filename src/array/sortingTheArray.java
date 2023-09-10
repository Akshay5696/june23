package array;

import java.util.Arrays;

public class sortingTheArray {
	public static void main(String[] args) {
		int[] a= {1,8,6,4,3,9,2,7,5};
		Arrays.sort(a); //bring values in sequence
		System.out.println("the largest no. is "+ a[a.length-1]);
		//we can print largest no after sorting only,no need of for & if loop
		for(int i=0;i<=a.length-1;i++) 
		{
			System.out.print(a[i]+", ");
		}
	}
}
 