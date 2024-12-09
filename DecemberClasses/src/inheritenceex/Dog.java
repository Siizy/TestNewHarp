package inheritenceex;

// IS-A relationship 
// Dog is an Animal ? True
// Cat is an Animal ? True
// Sparrow is an Animal ? False

public class Dog extends Animal{
	
	public void bark() {
		System.out.println("Dog barks");
	}
	
	public void eat() {
		System.out.println("Dog eats");
	}
	
	
	public void test() {
		eat();
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
				
		System.out.println(dog.colour);		
		dog.bark();
		
		Animal ani = new Dog();
		ani.eat();
		// ani.bark();
		Animal ani1 = new Animal();
		ani1.eat();
		
	}
}
