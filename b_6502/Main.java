package b_6502;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		while (true) {
			int r = sc.nextInt();
			if (r == 0)
				break;
			int w = sc.nextInt();
			int l = sc.nextInt();
			double tmp = Math.pow(w, 2) + Math.pow(l, 2);
			
			if (2 * r >= Math.sqrt(tmp))
				sb.append("Pizza " + cnt + " fits on the table." + "\n");
			else
				sb.append("Pizza " + cnt + " does not fit on the table." + "\n");
			cnt++;
			
		}
		sc.close();
		System.out.print(sb.toString());

	}

}
