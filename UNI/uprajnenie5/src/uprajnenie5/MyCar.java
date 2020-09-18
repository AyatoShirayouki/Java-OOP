package uprajnenie5;

public class MyCar extends Car{
	String number;
	String year;
	
	public MyCar(String brand, String country, String number, String year) {
		super(brand, country);
		this.number = number;
		this.year = year;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.print("; Number: " + number + "; Year: " + year);
	}
}
