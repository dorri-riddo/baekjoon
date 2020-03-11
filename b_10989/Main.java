package b_10989;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		// �Է��� �� �ִ� ���� 10000���� �����Ƿ�
		int[] array = new int[10001];
		
		for (int i = 0; i < N; i++) {
			array[Integer.parseInt(bf.readLine())]++;
		}
		
		for (int i = 1; i <= 10000; i++) {
			// �ߺ��� ������� �ϹǷ�
			for (int j = 0; j < array[i]; j++) {
				sb.append(i + "\n");
			}
		}
		
		System.out.print(sb.toString());
	}
	
	
	// �� ���Ŀ��� �ߺ��Ǵ� ���� �־ ���� �� �ֵ��� ����
	// �ð� �ʰ�
//	public static int[] sort(int[] array, int left, int right) {
//		int i = left;
//		int j = right;
//		int pivot = array[(left + right) / 2];
//		
//		if (left < right) {
//			while(i < j) {
//				// �����ʿ� �ִ� array[j]�� pivot ���� ũ�� ������ġ�� �ֱ� ������ j �� ������ġ�� �ű�� 
//				while(array[j] > pivot) j--;
//				// ���ʿ� �־�� �ϴ� array[i] �� pivot ���� �����Ƿ� ������ġ�� �ֱ� ������ i �� ���� ��ġ�� �ű��
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
//			// pivot �� ������ ���� ���� �迭 ���� (���)
//			sort(array, left, i - 1);
//			// pivot �� ������ ���� ������ �迭 ���� (���)
//			sort(array, i + 1, right);
//		}
//		
//		return array;
//	}

}
