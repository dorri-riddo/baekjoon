package b_10988;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		
		sc.close();
		
		System.out.print(func(str));
	}
	
	public static int func(String str) {
		int length = str.length();
		int cnt;
		
		if (length % 2 == 0) 
			cnt = 1;
		else
			cnt = 2;
		
		for (int i = length / 2 - 1; i >= 0; i--) {
			char a = str.charAt(i);
			char b = str.charAt(i + cnt);
			if (str.charAt(i) != str.charAt(i + cnt)) {
				return 0;
			}
			cnt += 2;
		}
		
		return 1;
	}

}
