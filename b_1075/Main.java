package b_1075;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int f = sc.nextInt();
		sc.close();
			
		String nTmp = n.substring(0, n.length() - 2);
		String p = "00";
		int cnt = 0;
		for (int i = 0; i < 100; i++) {
			if (Integer.parseInt(nTmp + p) % f == 0) {
				System.out.print(p);
				break;
			}
			cnt++;
			if (cnt < 10) {
				p = p.charAt(0) + ("" + cnt);
			} else {
				p = "" + cnt;
			}
		}
	}

}
