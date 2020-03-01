package b_2523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int copyN = N;
		
		while(copyN-- > 0) {
			for (int i = 0; i < N - copyN; i++) {
				sb.append('*');
			}
			sb.append("\n");
		}
		copyN = 0;
		while(copyN++ < N) {
			for (int i = N - copyN; i > 0; i--) {
				sb.append('*');
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());

	}

}
