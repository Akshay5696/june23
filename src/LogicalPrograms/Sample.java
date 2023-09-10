package LogicalPrograms;
//    *
//   **
//  ***
// ****
//*****
//lines=5,max stars=5(in one line),max space=4(in one line)
public class Sample {
public static void main(String[] args) {
	
	for (int i=1;i<=5;i++) //lines
	{
		for(int j=4; j>=i; j--) //space
		{
			System.out.print(" ");
		}
		for (int k=1; k<=i; k++) //star
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
