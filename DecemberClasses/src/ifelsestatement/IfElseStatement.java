package ifelsestatement;

public class IfElseStatement {

	public static void main(String[] args) {

		int number = 25;

		if (number == 100) {
			System.out.println("Number is greater than 100");
			
		} 
		else if(number == 25) {
			System.out.println("Number is less than 100");
		}
		
		if(number == 75) {
			System.out.println("Number is less than 100");
		}
		else {
			System.out.println("I am out");
		}
	}
}
