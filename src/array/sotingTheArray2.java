package array;

public class sotingTheArray2 {
public static void main(String[] args) {
	// without using Arrays.sort()
	int[] a= {5,9,6,2,78,1,36,41,4};
	for(int i=0;i<=a.length-1;i++) 
	{
		for(int j=i+1;j<=a.length-1;j++) 
		{
			if(a[i]>a[j]) 
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<=a.length-1;i++) 
	{
		System.out.print(a[i]+", ");
	}
}
}
