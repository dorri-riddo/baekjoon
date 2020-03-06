package b_1463;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1463
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] array = new int[101];
		array[1] = 0;
		array[2] = 1;
		array[3] = 1;
		
		// 1. 3으로 나뉘어 떨어지면 3으로 나눈다. -> n / 3 의 경우에서  횟수 + 1 만 하면 됨 (n / 3 의 값을 만들기 위해 한 번 나누어야 하므로)
		// ex n = 9 인 경우 n = 3 으로 만드는 데 횟수  + 1 이 추가되고, 이후엔 n = 3 이 n = 1 로 만드는데 드는 횟수만 더하면 된다.
		// 2. 2로 나뉘어 떨어지면 2로 나눈다. -> n / 2 의 경우에서 횟수 + 1 만 하면 됨
		// 3. 1을 뺀다. -> (n - 1) 의 경우에서 n 에서 - 1 을 한 횟수 1회만 더하면 된다. 
		
		for (int i = 4; i <= n; i++) {
			// 10 의 경우에는 바로 2를 나눈 것보다 9 계산 방법에서 -1 한 방법을 하나 더하는 게 빠르다
			// 때문에 - 1 을 했을 때 경우의 수를 먼저 계산하고 이후 3으로 나눴을 때 혹은 2로 나눴을 때 min 함수를 계산
			array[i] = array[i - 1] + 1;
			if (i % 3 == 0)
				array[i] = min(array[i], array[i / 3] + 1);
			else if (i % 2 == 0)
				array[i] = min(array[i], array[i / 2] + 1);
		}
		
		System.out.print(array[n]);
	}
	
	public static int min(int x, int y) {
		if (x > y)
			return y;
		else
			return x;
	}
}
