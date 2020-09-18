package uprajnenie3;

public class sort {

	public static void main(String[] args) {
		String[] arr = {"aaabbcc", "ab", "abc", "abcd"};
		String max = arr[0];
		String str = "";
		
		int count = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() > count) {
				count = arr[i].length();
				max = arr[i];
			}
		}
		
		for (int i = max.length() - 1; i >= 0; i--) {
			str += max.charAt(i);
		}
		System.out.print(str);
	}

}
