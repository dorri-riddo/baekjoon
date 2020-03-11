package b_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		bf.close();
		
		String str = "" +  n;
		int[] array = new int[str.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i) - '0';
		}
		
		array = sort(array, array.length - 1);
		
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		
		System.out.print(sb.toString());
	}
	
	// 버블 정렬
	public static int[] sort(int[] array, int n) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			// 내림차순이므로 array[i + 1] 이 더 작아야 한다
			if (array[i] < array[i + 1]) {
				int tmp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = tmp;
				cnt++;
			}
		}
		
		// 한번도 스왑되지 않으면 더 이상 바뀔 구간이 없단 뜻이다 (= 정렬을 마친 상태)
		if (cnt == 0)
			return array;
		
		if (n != 1)
			array = sort(array, n - 1);
		return array;
		
	}

}
