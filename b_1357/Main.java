package b_1357;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		
		System.out.print(Integer.parseInt(reverse("" + (Integer.parseInt(reverse(s1)) + Integer.parseInt(reverse(s2))))));

	}
	
	public static String reverse(String s) {
		return (new StringBuffer(s)).reverse().toString();
	}
}
