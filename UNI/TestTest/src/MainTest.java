import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		Student s1 = new Student("12345678", "374562356247", "Gosho", 20);
		Student s2 = new Student("87654321", "735673562385", "Pesho", 26);
		Educator e1 = new Educator("01923774627", "Professor Ivanov", 35, "Matematika");
		Educator e2 = new Educator("29867239829", "Professor Georgiev", 17, "Infortika");
		
		int count = 0;
		int count2 = 0;
		ArrayList<Human> arr = new ArrayList<Human>();
		arr.add(s1); arr.add(s2); arr.add(e1); arr.add(e2);
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getClass().getSimpleName().equals("Student")) {
				if(arr.get(i).getSomething() >= 25) {
					count++;
				}
			}
			if(arr.get(i).getClass().getSimpleName().equals("Educator")) {
				if(arr.get(i).getSomething() >= 30) {
					count2++;
				}
			}
		}
		System.out.println("Student older then 25: " + count);
		System.out.println("Educator with 30+ years of experience: " + count2);
		
		System.out.println();
		
		System.out.println("Content of ArrayList:");
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getClass().getSimpleName().equals("Student")) {
				
					System.out.println(arr.get(i).name + " EGN: " + arr.get(i).egn);
					
				
			}
			if(arr.get(i).getClass().getSimpleName().equals("Educator")) {
				
					System.out.println(arr.get(i).name + " EGN: " + arr.get(i).egn);
				
			}
		}
	}

}
