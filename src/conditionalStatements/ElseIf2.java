package conditionalStatements;
//Travel from Pune to Banglore
public class ElseIf2 {
public static void main(String[] args) {
	int money = 100;
	if (money>=2000) 
	{
	System.out.println("Yes, i can trvel by flight");
	}
	else if (money>=800) 
	{
	System.out.println("Yes, i can trvel by Bus");	
	}
	else if (money>=500)
	{
	System.out.println("Yes, i can trvel by train");	
	}
	else {
		System.out.println("No,i cant travel due to insufficient money");
	}
}
}
