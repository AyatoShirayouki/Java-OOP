package uprajnenie4;

public class Factoriel {
	public static long factoriel(int n) {
		if(n >= 1) {
			return n * factoriel(n - 1);
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(factoriel(5));
	}

}
