package b_2108;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		int[] array = new int[n];
		int[] list = new int[8001];
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(bf.readLine());
			sum += array[i];
			list[array[i] + 4000]++;
		}
		bf.close();
		
		// 산술 평균
		sb.append(Math.round((float) sum / n) + "\n");		
		Arrays.sort(array);
//		array = sort(array, 0, array.length - 1);
		// 중앙값
		sb.append(array[(array.length - 1) / 2] + "\n");
		
		int cnt = 0;
		for (int i = 1; i < list.length; i++) {
			if (list[i] > cnt)
				cnt = list[i];
		}
		int k = 0;
		int[] mode = new int[2];
		for (int i = 1; i < list.length; i++) {
			if (list[i] == cnt) {
				mode[k] = i - 4000;
				k++;
			}
			if (k == 2)
				break;
		}
		// 최빈값
		if (k == 1)
			sb.append(mode[0] + "\n");
		else
			sb.append(mode[1] + "\n");
		
		//범위
		sb.append(Math.abs(array[array.length - 1] - array[0]));		
		
		System.out.print(sb.toString());
	}
	
	// API 없이  sort 를 구현했을 경우에는.. 시간초과
//	public static int[] sort(int[] array, int left, int right) {
//		int i = left;
//		int j = right;
//		int pivot = array[(left + right) / 2];
//		
//		if (left < right) {
//			while (i < j) {
//				while(array[j] > pivot) j--;
//				while(array[i] < pivot) i++;
//				while(array[i] == array[j] && i != j) i++;
//				
//				int tmp = array[i];
//				array[i] = array[j];
//				array[j] = tmp;
//			}
//			
//			array = sort(array, left, i - 1);
//			array = sort(array, i + 1, right);
//		}
//		
//		return array;
//	}
}
