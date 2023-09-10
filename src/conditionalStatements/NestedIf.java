package conditionalStatements;
// login--> un,pwd,otp,captcha
public class NestedIf {
public static void main(String[] args) {
	String usn ="Abc";
	String pwd ="Abc@123";
	/* if 1st if gets wrong or false then further loop will 
	end and progrm direct go to its else and program will be end 
	 */
	
	if (usn=="Abc") 
	{
	System.out.println("username is correct");
	if (pwd=="Abc@123") 
	{
	System.out.println("password is correct");
	System.out.println("Login successful");
	}
	else {
		System.out.println("password is wrong");
	}
	}
	else 
	{
	System.out.println("username is wrong");	
	}
}
}
