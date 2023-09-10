package array;

public class multiDimentional {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6,7},{8,9,0,1,2}};
		System.out.println(a[1][0]);
		System.out.println(a[2][1]);
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[0].length);
		System.out.println(a[2].length);
		
		int[][] b = new int[2][3];
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
		b[1][0]=4;
		b[1][1]=5;
		b[1][2]=6;
		//1, 2, 3,
		//4, 5, 6,
		
		for(int i=0;i<=b.length-1;i++) 
		{
			for(int j=0;j<=b[i].length-1;j++) 
			{
				System.out.print(b[i][j]+", ");
			}
			System.out.println();
		}
		for(int i=0;i<=a.length-1;i++) 
		{
			for(int j=0;j<=a[i].length-1;j++) 
			{
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}
	}
}
