package upr6;

public class Rectangle extends Shape{
	public Rectangle(float str1, float str2) {
		super(str1, str2);
		
	}

	@Override
	float area() {
		return (str1 * str2);
	}
}
