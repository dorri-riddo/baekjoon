package b_9095;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/9095
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int n = sc.nextInt();
			sb.append(func(n) + "\n");
		}
		
		System.out.print(sb.toString());

	}

	// ex) num = 4
	// num=1 인 경우에서  + 3 을 하는 경우의 수
	// num=2 인 경우에 + 2 를 한 경우
	// num=3 에서 + 1 을 하면 num=4일 때의 경우의 수가 전부 나온다 
	// 따라서 1,2,3일 때의 경우의 수를 더하면 된다 (그 경우의 수에서 각각 +1 +2 +3 만 하면 되므로)
	public static int func(int num) {
		if (num == 1)
			return 1;
		else if (num == 2)
			return 2;
		else if (num == 3)
			return 4;
		else {
			return func(num - 1) + func(num - 2) + func(num - 3);
		}
	}
}
