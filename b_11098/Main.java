package b_11098;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		while (n-- > 0) {
			int p = Integer.parseInt(bf.readLine());
			Object[][] arr = new Object[p][2];
			StringTokenizer st;
			for (int i = 0; i < p; i++) {
				st = new StringTokenizer(bf.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = st.nextToken();
			}
			
			Arrays.sort(arr, new Comparator<Object[]>() {

				@Override
				public int compare(Object[] o1, Object[] o2) {
					return Integer.compare((int) o1[0], (int) o2[0]);
				}
				
			});
			
			sb.append(arr[p - 1][1] + "\n");
		}
		bf.close();
		System.out.print(sb.toString());

	}

}
