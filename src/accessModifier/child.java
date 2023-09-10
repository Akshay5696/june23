package accessModifier;

public class child extends parent {
	public static void main(String[] args) {
		parent p=new parent();
//		p.bunglow();	//private
		p.farm();		//default
		p.jwellary();	//protected
		p.car();		//public
	}
}
