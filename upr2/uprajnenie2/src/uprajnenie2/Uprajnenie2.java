package uprajnenie2;

import java.util.Scanner;
import java.lang.Math;

public class Uprajnenie2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ax^2 + bx + c");
		System.out.print("a = ");
		double a = input.nextDouble();
		System.out.print("b = ");
		double b = input.nextDouble();
		System.out.print("a = ");
		double c = input.nextDouble();
		
		double D = b * b - 4 * a * c;
		double x1 = 0, x2 = 0;
		
		if (D < 0) {
			System.out.println("Nqma realni koreni!");
		}
		else if(D == 0){
			x1 = -b / (2*a);
			x2 = x1;
			System.out.println("X1 = " + x1 + ", X2 = " + x2);
		}
		else if(D > 0) {
			x1 = (-b + Math.sqrt(D))/ 2*a;
			x2 = (-b - Math.sqrt(D))/ 2*a;
			System.out.println("X1 = " + x1 + ", X2 = " + x2);
		}
		
		
	}
}
