package switchstatement;

public class SwitchEx2 {

	public static void main(String[] args) {
				
		String name = "James";
		
		switch (name) {
		
		case "Ananya": {
			System.out.println("This is Ananya");
			break;
		}
		
		case "11": {
			System.out.println("This is Sanya");
			break;
		}
		case "12": {
			System.out.println("This is Pakhi");	
			break;
		}
		case "James2": {
			System.out.println("This is Rajesh");	
			break;
		}
		case "13": {
			System.out.println("This is Ajay");	
			break;
		}
		case "14": {
			System.out.println("This is Smith");	
			break;
		}
		case "15": {
			System.out.println("This is James");
			break;
		}
		default:
			System.out.println("Nothing matched!!");			
		}				
	}
}
