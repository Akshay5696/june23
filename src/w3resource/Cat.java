package w3resource;

public class Cat extends Animal{
	public void makeSound() 
	{
		System.out.println("Cat sound is quarrel");
	}
	public static void main(String[] args) {
		Animal anml=new Animal();
		anml.makeSound();
		
		Cat ct=new Cat();
		ct.makeSound();
	}
}
