package b_3035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int ZR = sc.nextInt();
		int ZC = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		String[] arr = new String[R];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			for (int l = 0; l < ZR; l++) {
				for (int j = 0; j < arr[i].length(); j++) {
					for (int k = 0; k < ZC; k++) {
						sb.append(arr[i].charAt(j));
					}
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());		
	}
}
