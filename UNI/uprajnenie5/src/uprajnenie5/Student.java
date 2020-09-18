package uprajnenie5;

public class Student extends Person{
	String fNumber;
	String specialnost;
	
	public Student(String name, int age, String fNumber, String specialnost) {
		super(age, name);
		this.fNumber = fNumber;
		this.specialnost = specialnost;
		System.out.println("Student");
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.print(fNumber + " " + specialnost);
	}
}
