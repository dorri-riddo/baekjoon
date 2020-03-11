package b_10989;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		// 입력할 수 있는 수가 10000보다 작으므로
		int[] array = new int[10001];
		
		for (int i = 0; i < N; i++) {
			array[Integer.parseInt(bf.readLine())]++;
		}
		
		for (int i = 1; i <= 10000; i++) {
			// 중복을 보여줘야 하므로
			for (int j = 0; j < array[i]; j++) {
				sb.append(i + "\n");
			}
		}
		
		System.out.print(sb.toString());
	}
	
	
	// 퀵 정렬에서 중복되는 수가 있어도 나올 수 있도록 수정
	// 시간 초과
//	public static int[] sort(int[] array, int left, int right) {
//		int i = left;
//		int j = right;
//		int pivot = array[(left + right) / 2];
//		
//		if (left < right) {
//			while(i < j) {
//				// 오른쪽에 있는 array[j]가 pivot 보다 크면 정상위치에 있기 때문에 j 를 다음위치로 옮긴다 
//				while(array[j] > pivot) j--;
//				// 왼쪽에 있어야 하는 array[i] 가 pivot 보다 작으므로 정상위치에 있기 때문에 i 를 다음 위치로 옮긴다
//				while(array[i] < pivot) i++;
//				if (array[i] == array[j] && i != j) {
//					i++;
//				}
//				
//				int temp = array[i];
//				array[i] = array[j];
//				array[j] = temp;
//			}
//			
//			// pivot 을 제외한 남은 왼쪽 배열 정렬 (재귀)
//			sort(array, left, i - 1);
//			// pivot 을 제외한 남은 오른쪽 배열 정렬 (재귀)
//			sort(array, i + 1, right);
//		}
//		
//		return array;
//	}

}
