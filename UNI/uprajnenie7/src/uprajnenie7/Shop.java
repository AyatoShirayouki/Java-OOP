package uprajnenie7;

public class Shop {
	
	public static void orderInfo(Product item) {
		item.showName();
		item.showLoc();
		System.out.println(item.brand + " " + item.phone);
		System.out.println(item.getPrice(150));
	}

	public static void main(String[] args) {
		Book java = new Book();
		Shoes boots = new Shoes();
		
		orderInfo(java);
		orderInfo(boots);
	}

}
