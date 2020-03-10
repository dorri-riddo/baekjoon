package b_2751;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] array = new int[N];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(bf.readLine()); 
		}
		
		array = sort(array, 0, array.length - 1);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i] + "\n");
		}
		System.out.print(sb.toString());
	}
	
	// pivot 을 기준으로 좌우를 정리하는 퀵정렬 이용
	public static int[] sort(int[] array, int left, int right) {
		int i = left;
		int j = right;
		int pivot = array[(left + right) / 2];
		
		if (left < right) {
			while(i < j) {
				// 오른쪽에 있는 array[j]가 pivot 보다 크면 정상위치에 있기 때문에 j 를 다음위치로 옮긴다 
				while(array[j] > pivot) j--;
				// 왼쪽에 있어야 하는 array[i] 가 pivot 보다 작으므로 정상위치에 있기 때문에 i 를 다음 위치로 옮긴다
				while(array[i] < pivot) i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
			// pivot 을 제외한 남은 왼쪽 배열 정렬 (재귀)
			sort(array, left, i - 1);
			// pivot 을 제외한 남은 오른쪽 배열 정렬 (재귀)
			sort(array, i + 1, right);
		}
		
		return array;
	}
}
