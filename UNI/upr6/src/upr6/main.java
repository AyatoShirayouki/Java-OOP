package upr6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//System.out.println("Vkarai neshto we: ");
		//Scanner s = new Scanner(System.in); 
		Triangle t1 = new Triangle(3, 2);
		Triangle t2 = new Triangle(1, 2);
		Rectangle r1 = new Rectangle(3, 5);
		Rectangle r2 = new Rectangle(4, 5);
		//System.out.println("Area triangle: " + t1.area());
		//System.out.println("Area rectangle: " + r1.area());
		
		ArrayList<Shape> arr = new ArrayList<Shape>();
		
		arr.add(t1);
		arr.add(t2);
		arr.add(r1);
		arr.add(r2);
		
		double maxTriangle = Double.MIN_VALUE;
		double maxRectangle = Double.MAX_VALUE;
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getClass().getSimpleName().equals("Triangle")) {
				if(arr.get(i).area() > maxTriangle) {
					maxTriangle = arr.get(i).area();
				}
			}
			else if(arr.get(i).getClass().getSimpleName().equals("Rectangle")) {
				if(arr.get(i).area() < maxRectangle) {
					maxRectangle = arr.get(i).area();
				}
			}
		}
		
		System.out.println(maxTriangle);
		System.out.println(maxRectangle);
	}

}
