package basic;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we created object here using new keyword
		// parameter less constructor gets a call
		Student student = new Student();
		student.displayStudentInformation();
		
		// Parameterised constructor gets a call
		Student studentOne = new Student(100,"Rahul","Pune");
		studentOne.displayStudentInformation();
		
		System.out.println("===========================================");
		Student studentTwo = new Student(101,"Radhika");
		studentTwo.displayStudentInformation();
	}

}
