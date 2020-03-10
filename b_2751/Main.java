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
	
	// pivot �� �������� �¿츦 �����ϴ� ������ �̿�
	public static int[] sort(int[] array, int left, int right) {
		int i = left;
		int j = right;
		int pivot = array[(left + right) / 2];
		
		if (left < right) {
			while(i < j) {
				// �����ʿ� �ִ� array[j]�� pivot ���� ũ�� ������ġ�� �ֱ� ������ j �� ������ġ�� �ű�� 
				while(array[j] > pivot) j--;
				// ���ʿ� �־�� �ϴ� array[i] �� pivot ���� �����Ƿ� ������ġ�� �ֱ� ������ i �� ���� ��ġ�� �ű��
				while(array[i] < pivot) i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
			// pivot �� ������ ���� ���� �迭 ���� (���)
			sort(array, left, i - 1);
			// pivot �� ������ ���� ������ �迭 ���� (���)
			sort(array, i + 1, right);
		}
		
		return array;
	}
}
