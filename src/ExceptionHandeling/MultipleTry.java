package ExceptionHandeling;

public class MultipleTry {
	public static void main(String[] args) {
		//1st try block
		try 
		{
			//try block-1
		}
		catch(Exception e) 
		{
			
		}
		
		//2nd try block
		try 
		{
			//try block-2
		}
		catch(Exception e) 
		{
			
		}
		
		//nested try block
		try 
		{
			try 
			{
				try 
				{
				//nested try block	
				}
				catch(Exception e) 
				{
					
				}	
			}
			catch(Exception e) 
			{
				
			}	
		}
		catch(Exception e) 
		{
			
		}
	}
}
