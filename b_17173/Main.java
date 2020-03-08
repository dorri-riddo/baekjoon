package b_17173;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		int[] array = new int[m];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] arr = new int[n + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		int sum = 0;
		// m 개 각각의 배수 중에 서로 겹치는 정수가 없도록 sum 에 더한 값은 0으로 만든다
		for (int i = 0; i < array.length; i++) {
			int div = array[i];
			// n 의 배수 첫 시작은 n 이므로 j 값을 div 로 초기화하고, j 에 더하는 값도 div 를 더한다
			for (int j = div; j < arr.length; j += div) {
				// arr[j] 가 0 이 아니라면 이전 배수로 계산된 값이 아니므로 더해도 된다
				// 0 이라면 arr[j] 정수가 다른 배수로 계산된 값이기 때문에 스킵
				if (arr[j] != 0) {
					sum += arr[j];
					arr[j] = 0;
				}
			}
		}
		
		System.out.print(sum);
	}

}
