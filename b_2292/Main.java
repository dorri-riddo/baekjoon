package b_2292;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2292
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int[] array = new int[20001];
		array[0] = 1;
		
		while(true) {
			if (N == 1) {
				count = 1;
				break;
			}
			count++;
			// 7까지는 두 곳, 19까지는 세 곳, 27까지는 네 곳을 지나가야 하는 등 D[n] = D[n - 1] + 6n 의 규칙이 있다. 
			// 그 규칙보단 작을 경우엔 더 지나가야 하므로 array 배열에 새로운 D[n] 을 넣고 count 를 늘려 새로 계산한다.
			if (6 * count + array[count - 1] < N) {
				array[count] = 6 * count + array[count - 1];
			} 
			//도착했으므로 도착 위치에 대해서 count++ 을 하고, while 문을 끝낸다. 
			else {
				count++;
				break;
			}
		}
		
		System.out.print(count);
	}

}
