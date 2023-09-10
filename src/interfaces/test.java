package interfaces;

public class test {
public static void main(String[] args) {
	//cant create object of parent coz constructor not exist in interface
	
	Jio jio = new Jio();
	jio.calling();
	jio.sms();
	jio.internet();
	jio.OTT();
	
	VI v = new VI();
	v.calling();
	v.sms();
	v.internet();
	v.OTT();
}
}
