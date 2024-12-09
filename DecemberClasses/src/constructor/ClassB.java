package constructor;

public class ClassB extends ClassA{
	
	public ClassB() {
		super();
		System.out.println("I am in ClassB const");
	}
	
	
	public static void main(String[] args) {
		
		ClassB clsB = new ClassB();
	}

}
