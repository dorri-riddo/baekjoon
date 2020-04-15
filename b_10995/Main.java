package b_10995;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		func(n);
	}
	
	static public void func(int n) {
		StringBuilder sb = new StringBuilder();
		if (n == 1) {
			System.out.print("*");
			return;
		}
		
		String first = "";
		String second = " ";
		for (int i = 0; i < n; i++) {
			first += "* ";
			second += "* ";
		}
		
		int k = 1;
		for (int i = 0; i < n; i++) {
			if (k % 2 == 1)
				sb.append(first + "\n");
			else
				sb.append(second + "\n");
			k++;
		}
		System.out.print(sb.toString());
	}
}
