package calculator;

public class ClassA {

	public void add() {		
		int number1 = 23;
		int number2 = 20;
		int sum = number1 + number2;
		System.out.println("Sum is : " + sum);
	}

	public void substract() {
		int number1 = 23;
		int number2 = 20;
		int total = number1 - number2;
		System.out.println("Substraction is : " + total);
	}
	
	public void divide() {
		int number1 = 25;
		int number2 = 5;
		int total = number1 / number2;
		System.out.println("Division is : " + total);
	}
	
	public void test02() {
		add();
	}
	
	public static void main(String args[]) {
		ClassA obj = new ClassA(); //object creation
		obj.add();
		obj.substract();	
		obj.divide();
		
		ClassA obj2 = new ClassA();		
	}
}
