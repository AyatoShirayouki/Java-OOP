package uprajnenie5;

public class Car{
	String brand;
	String country;
	
	
	public Car(String brand, String country) {
		this.brand = brand;
		this.country = country;
	}
	
	public void printInfo() {
		System.out.println("Brand: " + brand + "; Country: " + country);
	}
}
