package b_10814;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		
		Object[][] array = new Object[n][2];
		for (int i = 0; i < array.length; i++) {		 
			st = new StringTokenizer(bf.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = st.nextToken();			
		}
		bf.close();
		
		// ���̰� ������ ��� �̸� ����� ������� ���;� �ϱ� ������ API ���� �Ϲ� ����Ʈ ������ �����ϴ� ����� ã�� ����..
		// sort �޼ҵ忡�� Comparator �� ���� ���� ����
		Arrays.sort(array, new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {
				return Integer.compare((int) o1[0],(int) o2[0]);
			}			
		});
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sb.append(array[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
