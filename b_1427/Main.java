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
	
	// ���� ����
	public static int[] sort(int[] array, int n) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			// ���������̹Ƿ� array[i + 1] �� �� �۾ƾ� �Ѵ�
			if (array[i] < array[i + 1]) {
				int tmp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = tmp;
				cnt++;
			}
		}
		
		// �ѹ��� ���ҵ��� ������ �� �̻� �ٲ� ������ ���� ���̴� (= ������ ��ģ ����)
		if (cnt == 0)
			return array;
		
		if (n != 1)
			array = sort(array, n - 1);
		return array;
		
	}

}
