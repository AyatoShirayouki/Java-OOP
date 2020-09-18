package uprajnenie7;

public class Shoes implements Product{
	
	public String getPrice(int br) {
		if(br < 5) {
			return "Promotion!";
		}
		else {
			return "No promotion!";
		}
	}

	@Override
	public void showName() {
		System.out.println("Shoes");
	}

	@Override
	public void showLoc() {
		System.out.println("BG");
	}

}
