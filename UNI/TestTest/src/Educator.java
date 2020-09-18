
public class Educator extends Human{
	String catedra;
	int staj;
	public Educator(String egn2, String name2, int staj, String catedra) {
		super(egn2, name2);
		this.catedra = catedra;
		this.staj = staj;
	}
	@Override
	int getSomething() {
		// TODO Auto-generated method stub
		return staj;
	}
	
}
