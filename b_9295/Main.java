package b_9295;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int cnt = 1;
		while (n-- > 0) {
			sb.append(String.format("Case " + cnt++ + ": %d\n", sc.nextInt() + sc.nextInt()));
		}
		sc.close();
		System.out.print(sb.toString());

	}

}
