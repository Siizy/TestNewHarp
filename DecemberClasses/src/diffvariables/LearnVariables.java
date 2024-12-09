package diffvariables;

public class LearnVariables {
	
	int number = 34;
	
	static String city = "Mississauga";

	public static void main(String[] args) {
		LearnVariables lv = new LearnVariables();
		System.out.println(lv.number);
        System.out.println(city);
	}
	
	// local , instance, class/static
	
	public  void run() {
		System.out.println(number);
	}
	
	public void test() {
		System.out.println(city);
		System.out.println("Number is : " + number );
		System.out.println(LearnVariables.city);
	}
}
