package diffvariables;

public class TestClass {
	
	int number = 35;
	
	public void test01() {
		
		LearnVariables lv = new LearnVariables();
		int num = lv.number;
		lv.run();
		
		System.out.println(lv.number);
		
	}	
}
