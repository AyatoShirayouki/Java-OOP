
public class Student extends Human{
	String facNum;
	int age;
	public Student(String facNum, String egn, String name, int age) {
		super(egn, name);
		this.facNum = facNum;
		this.age = age;
	}
	@Override
	int getSomething() {
		return age;
	}
}
