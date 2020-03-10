package b_10953;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		while(T-- > 0) {
			String[] result = sc.next().split(",");
			sb.append(Integer.parseInt(result[0]) + Integer.parseInt(result[1]) + "\n");
		}
		
		System.out.print(sb.toString());
	}

}
