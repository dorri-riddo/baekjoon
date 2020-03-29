package b_15652;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		func(n, m, "", 1, 0);

	}
	
	static public void func(int n, int m, String str, int min, int pos) {
		if (pos == m) {
			System.out.println(str);
			return;
		}
		
		for (int i = min; i <= n; i++) {
			func(n, m, str + i + " ", i, pos + 1);
		}
	}

}
