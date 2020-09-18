package uprajnenie2;
import javax.swing.JOptionPane;
public class day {

	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("n = "));
		switch (n) {
		case 1: {
			//System.out.print("Raboten");
			//break;
		}
		case 2: {
			//System.out.print("Tuesday");
			//break;
		}
		case 3: {
			//System.out.print("Wednesday");
			//break;
		}
		case 4: {
			//System.out.print("Thursday");
			//break;
		}
		case 5: {
			System.out.print("Raboten");
			break;
		}
		case 6: {
			//System.out.print("Pochiven");
			
		}
		case 7: {
			System.out.print("Pochiven");
			break;
		}
		default:
			System.out.print("Not a valid day.");
			break;
		}
	}

}
