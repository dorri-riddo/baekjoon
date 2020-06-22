package b_2908;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		int a = reverse(A);
		int b = reverse(B);
		
		if (a >= b)
			System.out.print(a);
		else 
			System.out.print(b);
	}
	
	public static int reverse(String strNum) {
		String reverseNum = "";
		for (int i = strNum.length() - 1; i >= 0; i--) {
			reverseNum += strNum.charAt(i);
		}
		
		return Integer.parseInt(reverseNum);
	}

}
