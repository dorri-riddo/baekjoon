package b_9020;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/9020
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] array = new int[10001];
		
		for (int i = 1; i < array.length; i++) {
			array[i] = i;
		}
		
		// 에라토스테네스의 체 알고리즘을 이용하여 배열에 소수만 남겨둔다
		for (int i = 2; i < array.length; i++) {
			if (array[i] == 0)
				continue;
			int num = i;
			while(num + i < array.length) {
				array[num += i] = 0;
			}
		}

		int T = sc.nextInt();
		
		while(T-- > 0) {
			int n = sc.nextInt();
			String result = "";
			int sub = 10000;
			
			for (int i = 2; i <= n; i++) {
				// 1은 소수가 아니므로 패스
				if (array[n - array[i]] == 1)
					continue;
				// n = 8, i = 2 로 가정
				// array[n - array[i]] 는 6의 위치로 배열 값이 0이므로 2+6=8 이지만 소수끼리의 덧셈은 아니다.
				// 계산을 반복하여 소수끼리의 합일 경우를 찾는다 (배열값에 0이어서는 안됨)
				if (array[n - array[i]] != 0) {
					// 경우가 여러개일 경우 두 소수의 차이가 가장 적은 경우를 출력하므로 sub 변수를 통해 차이가 가장 적은지 확인한다
					// 두 소수의 차이가 음수로 내려갈 경우 처음 계산에서 반대로 계산 (ex n=10, 3 7 과 7 3) 이 된 것 뿐이므로 0보다 커야 한다
					// n = 10 일 경우 5,5 가 있듯이 차이가 0일 수도 있음을 염두에 둬야 한다
					if (array[n - array[i]] - array[i] < sub && array[n - array[i]] - array[i] >= 0) {
						result = i + " " + array[n - array[i]];
						sub = array[n - array[i]] - array[i];
					}
				}
			}
			
			sb.append(result + "\n");
		}
		
		System.out.print(sb.toString());
	}

}
