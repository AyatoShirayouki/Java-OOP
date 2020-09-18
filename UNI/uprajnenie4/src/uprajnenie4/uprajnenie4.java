package uprajnenie4;
import java.util.Scanner;

public class uprajnenie4 {
	public static double power(int k, int n) {
		if(n == 0) {
			return 1;
		}
		else {
			double t = power(k, n/2);
			if(n % 2 == 0) {
				return t * t;
			}
			else {
				return t * t * k;
			}
		}
	}
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//int n = input.nextInt();
		int k = 500;
		int n = 100;
		System.out.println(k + "**" + n + "=" + power(k, n));
	}

}
