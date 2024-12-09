package inheritenceex;

public class Test {

	public static void main(String[] args) {
	
		Animal ani = new Animal();		
		ani.eat();
		ani.sleep();
		
		ani = new Dog();
		ani.eat();
		ani.sleep();
		
		ani = new Cat();
		ani.eat();
		ani.sleep();
	
	}
}
