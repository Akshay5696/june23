package accessModifier2;

import accessModifier.parent;

public class childFromDifferentPackage extends parent {
	public static void main(String[] args) {
		parent p=new parent();
//		p.bunglow();	//private
//		p.farm();		//default
//		p.jwellary();	//protected
		p.car();		//public
	}
}
