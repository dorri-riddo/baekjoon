package b_10250;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/10250
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int y = 1;
			int x = 1;
			
			for (int i = 1; i < N; i++) {
				if (y < H) {
					y++;
				}
				else { 
					y = 1;
					x++;
				}
			}
			
			if(x < 10) 
				sb.append(y + "0" + x + "\n");
			else
				sb.append("" + y + x + "\n");
		}
		
		System.out.print(sb.toString());

	}

}
