package uprajnenie5;

public class Person {
	public String name;
	int age;
	final String COUNTRY = "BG";
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person");
	}
	
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name + " " + age + " ");
	}
}
