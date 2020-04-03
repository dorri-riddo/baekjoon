package b_3028;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		char[] strArr = str.toCharArray();
		int[] arr = {1, 0, 0};
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] == 'A') {
				int tmp = arr[0];
				arr[0] = arr[1];
				arr[1] = tmp;
			}  else if (strArr[i] == 'B') {
				int tmp = arr[1];
				arr[1] = arr[2];
				arr[2] = tmp;				
			} else {
				int tmp = arr[0];
				arr[0] = arr[2];
				arr[2] = tmp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				System.out.println(i + 1);
		}
	}
}
