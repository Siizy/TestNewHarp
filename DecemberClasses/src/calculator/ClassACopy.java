package calculator;

public class ClassACopy {

	
	public static void main(String args[]) {
		ClassA obj = new ClassA(); //object creation
		obj.add();
		obj.substract();	
		obj.divide();		
	}
	
	public void test() {
		ClassA obj = new ClassA();
		obj.add();
	}
}
