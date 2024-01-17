package basic;

public class Student {

	// data members of a class
	private int rollNumber;
	private String studentName;
	private String address;	
	
	// constructor from super class
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// this is constructor using fields/ parametrised constructor
	public Student(int rollNumber, String studentName, String address) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.address = address;
	}

	public Student(int rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}

	public void displayStudentInformation() {
		
		System.out.println("Student information is as follows: \n");
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Student Name is : "+studentName);
		System.out.println("Address of student is : "+address);
	}
	
	
}
