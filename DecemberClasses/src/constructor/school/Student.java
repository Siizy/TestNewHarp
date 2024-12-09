package constructor.school;

public class Student {
	
	int rollNo;
	String name;
	int age;
	
	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		
	}

	public static void main(String[] args) {
		
		Student chandan = new Student(23, "Chandan", 10);
		System.out.println("Chandan rollNo = " + chandan.rollNo);
		
		Student harpreet = new Student();
		System.out.println("Harpreet rollNo = " + harpreet.rollNo);
		System.out.println("Harpreet rollNo = " + harpreet.name);
		
		//Student pakhi = new Student(10, "Pakhi", 19);
		//System.out.println("Pakhi rollNo = " + pakhi.rollNo);
	}
}
