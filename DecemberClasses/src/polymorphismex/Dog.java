package polymorphismex;


public class Dog extends Animal{
	
	//method overloading
	public void bark() {
		System.out.println("Dog barks");
	}

	public void sleep() {
		System.out.println("Dog Sleeps");
	}	
	
	public void sleep(String name) {
		System.out.println("Dog Sleeps");
	}	
}
