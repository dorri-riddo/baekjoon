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
		// m �� ������ ��� �߿� ���� ��ġ�� ������ ������ sum �� ���� ���� 0���� �����
		for (int i = 0; i < array.length; i++) {
			int div = array[i];
			// n �� ��� ù ������ n �̹Ƿ� j ���� div �� �ʱ�ȭ�ϰ�, j �� ���ϴ� ���� div �� ���Ѵ�
			for (int j = div; j < arr.length; j += div) {
				// arr[j] �� 0 �� �ƴ϶�� ���� ����� ���� ���� �ƴϹǷ� ���ص� �ȴ�
				// 0 �̶�� arr[j] ������ �ٸ� ����� ���� ���̱� ������ ��ŵ
				if (arr[j] != 0) {
					sum += arr[j];
					arr[j] = 0;
				}
			}
		}
		
		System.out.print(sum);
	}

}
