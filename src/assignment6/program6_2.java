package assignment6;

public class program6_2 {
	public static void main(String[] args) {
		program6_2 num = new program6_2();
		num.prime(7);
	}
	public void prime(int n) 
	{
		int count=0;
		for(int j=2; j<=n/2; j++ ) 
		{
			if(n%j!=0) 
			{
			count++; //count=count+1
			break;
			}
			if(count==0) 
			{
				System.out.println(j);
			}
		}
		
	}
}
