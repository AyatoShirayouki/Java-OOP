package uprajnenie3;

import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.lang.ArrayUtils;

public class Array {

	public static void main(String[] args) {
		int[] x = {100, -20, 30, 0, 5, 10};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < x.length; i++) {
			if(x[i] > max) {
				max = x[i];
			}
		}
		List b = Arrays.asList(ArrayUtils.toObject(x));
		System.out.print(max);
		System.out.print(Collections.max(x));
	}

}
