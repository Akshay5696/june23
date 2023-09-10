package accessModifier;
/* there are 4 access modifier
1)private
2)default
3)protected
4)public
*/
public class parent {
	private void bunglow() 
	{
		System.out.println("parent bunglow");
	}
	void farm() //default-->no need of mention 
	{
		System.out.println("parent farm");
	}
	protected void jwellary() 
	{
		System.out.println("parent jwellary");
	}
	public void car() 
	{
		System.out.println("parent car");
	}
	public static void main(String[] args) {
		parent p=new parent();
		p.bunglow();	//private
		p.farm();		//default
		p.jwellary();	//protected
		p.car();		//public
	}
}
