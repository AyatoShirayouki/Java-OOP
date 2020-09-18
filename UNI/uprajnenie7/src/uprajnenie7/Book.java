package uprajnenie7;

public class Book implements Product{

	@Override
	public String getPrice(int br) {
		if(br < 100) {
			return "Promotion!";
		}
		else {
			return "No promotion!";
		}
	}

	@Override
	public void showName() {
		System.out.println("Book");
	}

	// @Override
	//public void showLoc() {
		//System.out.println("UA");
	//}

}
