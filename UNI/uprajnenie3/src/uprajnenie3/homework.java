package uprajnenie3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<Integer, Integer> d = new HashMap<Integer, Integer>();
		int positive = 0;
		int count;
		int n = 0;
		int dublicates = 0;
		int i = 1;
		int[] list = new int[101];
		while(true) {
			positive = 1;
			System.out.print("Enter a number (1-99): ");
			try {
					n = input.nextInt();
					count = d.containsKey(n) ? d.get(n) : 0; // Vuvejdane na kluch i stoinost v mapa
				}
				catch(InputMismatchException e) {
					System.out.println("End!");
					System.out.println("Dublicates: " + dublicates);
					break;
				}
			if(n >= 1 && n <= 99) {// proverqvane za validen vod
				for (int j = 0; j < i; j++) {
					if(n == list[j]) { //proverka za povtorenie
						list[i] = n;
						d.put(n, count + 1);
						if(d.get(n) == 2) { //proverka za suvpadenie tochno 2 puti
							System.out.println(n + " -Dublicated!");
							dublicates++;
						}
						break;
					}
					else{
						if(positive == 1) {// ogranichavane na pulneneto na masiva
							list[i] = n;
							d.put(n, count + 1); //icrementirane na stoinostta na klucha
							positive = 0;
						}
					}
				}
			}
			else {
				System.out.println("Number is not between 1 and 99!");
			}
			i++;
		}

	}

}
