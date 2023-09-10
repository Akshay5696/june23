package assignment6;

public class program6_1 {
	public static void main(String[] args) {
		int num=50;
		int count=0;
		System.out.println("PRIME NUMBERS FROM 1 TO 50");
		for(int i=1; i<=50; i++) 
		{
			count=0;
			for(int j=2; j<i/2; j++) 
			{
				if(i%j==0) 
				{
					count++;  //(count=count+1)
					break;
				}
			}
			if(count==0) 
			{
				System.out.println(i);
			}
		}
		
	}
}
