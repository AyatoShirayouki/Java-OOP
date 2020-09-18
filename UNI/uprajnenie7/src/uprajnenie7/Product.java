package uprajnenie7;

public interface Product extends Country {
	public final static String brand = "My Corp.";
	String phone = "111-222-333-444";
	
	public String getPrice(int br);
	public void showName();
}
