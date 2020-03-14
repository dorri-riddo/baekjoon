package b_11650;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		int[][] array = new int[N][2];
		
		for (int i = 0; i < array.length; i++) {
			st = new StringTokenizer(bf.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		} 		
		
		bf.close();

		array = sort(array, 0, array.length - 1);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sb.append(array[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());

	}
	
	public static int[][] sort(int[][] array, int left, int right) {
		int i = left;
		int j = right;
		int pivot = array[(left + right) / 2][0];
		
		if (left < right) {
			while (i < j) {
				while(array[j][0] > pivot) j--;
				while(array[i][0] < pivot) i++;
				// 중복의 경우 따로 처리
				// i == j 경우엔 당연히 동일하므로 제외시킨다
				if (array[i][0] == array[j][0] && i != j) {
					if (array[i][1] > array[j][1]) {
						for (int k = 0; k < 2; k++) {
							int tmp = array[i][k];
							array[i][k] = array[j][k];
							array[j][k] = tmp;
						}
					}
					i++;
				}
				
				for (int k = 0; k < 2; k++) {
					int tmp = array[i][k];
					array[i][k] = array[j][k];
					array[j][k] = tmp;
				}
				
			}
			
			array = sort(array, left, i - 1);
			array = sort(array, i + 1, right);
		}
		
		return array;
	}	

}
