package LogicalLoops;
//print numbers from 1 to 100 which are divisible by 2 and 3
public class For4 {
public static void main(String[] args) {
			for (int i=1;i<=100;i++) 
	{
			if (i%2==0 || i%3==0) // for "or" we can use || symbol
	{
			System.out.println(i);
	}	
	}
}
}
