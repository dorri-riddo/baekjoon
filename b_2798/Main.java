package b_2798;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	//https://www.acmicpc.net/problem/2798
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] array = new int[N];
		
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
	
		System.out.print(blackJack(N, M, array));

	}
	
	public static int blackJack(int N, int M, int[] array) {
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] > M)
						continue;
					else if (array[i] + array[j] + array[k] == M) {
						return M;
					} else if (array[i] + array[j] + array[k] > max)
						max = array[i] + array[j] + array[k];
				}
			}
		}
		
		return max;
	}

}
