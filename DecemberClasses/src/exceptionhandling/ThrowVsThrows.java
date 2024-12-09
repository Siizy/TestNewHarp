package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ThrowVsThrows {

	public void test() throws FileNotFoundException {
		
		 InputStream inputStream = null;
		
	     File file = new File("User/Harpreet/Document/fileTest.txt");
		 inputStream = new FileInputStream(file);
		    	  
	}
	
	public void callTest() throws FileNotFoundException {
		test();
	}
	
	public void throweg(){		
		System.out.println("Blank null");
		throw new ArithmeticException();		
	}
}
