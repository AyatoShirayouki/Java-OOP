
public class TwoTreadMain {
	public static void print(Thread1 t1, Thread2 t2) {
		t1.start();
		t2.start();
		//System.out.println("\n");
	}
	public static void main(String[] args) {
		Thread1 t1 = new Thread1(1050);
		Thread2 t2 = new Thread2(1050);
		
		print(t1, t2);
	}
}
