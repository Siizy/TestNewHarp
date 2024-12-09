package loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		for(int i = 10; i > 0 ; i--) {
			System.out.println("Value of i is : " + i);									
		}
		
		System.out.println("================");
		
		int i = 0;		
		while (i < 10) {
		   System.out.println("Value of i is : " + i);		
			i++;
		}
		
		System.out.println("================");
		
		int j = 0;
		
		do{
			System.out.println("Value of i is : " + i);	
			i++;
		}while(j>10);
		
		System.out.println("================");		
	}
}
