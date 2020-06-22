package b_10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < array.length; j++) {
				if (S.substring(i, i + 1).equals(array[j]))
					array[j] = "" + i;
			}
		}
	
		for (int i = 0; i < array.length; i++) {
			if (97 <= (int) array[i].charAt(0) && 122 >= (int) array[i].charAt(0))
				array[i] = "-1";
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
