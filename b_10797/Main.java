package b_10797;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < 5; i++) {
			if (k == sc.nextInt())
				cnt++;
		}
		
		sc.close();
		System.out.print(cnt);

	}

}
