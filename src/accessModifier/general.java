package accessModifier;

public class general {
	public static void main(String[] args) {
		parent p=new parent();
		//p.bunglow();	//private
		p.farm();		//default
		p.jwellary();	//protected
		p.car();		//public
		
			child c=new child();
			//c.bunglow();	//private
			c.farm();		//default
			c.jwellary();	//protected
			c.car();		//public
		}
	
}
