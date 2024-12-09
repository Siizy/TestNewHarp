package arrays;

public class TestArray {

	public static void main(String[] args) {
		
		String[] names = {"Chandan", "Harpreet", "Trisha", "Pakhi"};
		
		int[] test = new int[21];
		
		test[0] = 21;
		test[1] = 34;
		test[20] = 56; // create/add
		//test[22] = 34;
		
		System.out.println(test[2]); // read/access
		System.out.println(test[20]);
	
		
		int[] ages = {21, 45, 48, 15};
		boolean[] bool = {true, false, true, false};
		
		// collection - CRUD
		// CREATE/add
		// READ/access
		// UPDATE
		// DELETE
		
		System.out.println(names[2]);
		System.out.println(ages[1]);
		
		names[2] = "Trisha";
		System.out.println(names[3]);
		
		// string handling 
		// char array
		
		// "Chandan123Chandan"
		// convert to char array
		// 'C', 'h', 'a'
		
		// char[] chr = {'C', 'h', 'a', 'n'};
		
		//*
		//**
		//***
		
	}

}
