package uprajnenie3;
import java.util.Scanner;

public class uprajnenie3 {

	public static void main(String[] args) {
		//System.out.print("N = ");
		//Scanner input = new Scanner(System.in);
		
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
}

