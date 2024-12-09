package inheritenceex;


// Lab => Dog => Animal
public class Labrador extends Dog{

	public void test2() {
		eat();
		bark();
		Animal ani = new Labrador();		
	}
}
