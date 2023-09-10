package array;

public class onedimensional {
	public static void main(String[] args) {
		int[] a= {5,8,6,7,4,6,8,5,6,4,2,5,2,8};
		System.out.println(a[0]);
		System.out.println(a[8]);
		System.out.println(a.length);
		System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);
		
		int[] b = new int[5];
		b[0]=4;
		b[1]=6;
		b[2]=4;
		b[3]=8;
		b[4]=2;
		for(int i=0;i<=b.length-1;i++) 
		{
			System.out.print(b[i]+", ");
		}
		System.out.println();
		
		for(int j=0;j<=a.length-1;j++) 
		{
			System.out.print(a[j]+", ");
		}
		
	}
}
