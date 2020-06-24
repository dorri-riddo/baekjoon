package b_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());			
		
		Object[][] arr = new Object[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = i;
			arr[i][1] = bf.readLine();
		}
		Object[][] arrTmp = arr.clone();
		
		Arrays.sort(arrTmp, new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {
				return o1[1].toString().compareTo(o2[1].toString());
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		while (m -- > 0) {
			String tmp = bf.readLine();
			if (Character.isDigit(tmp.charAt(0))) {
				sb.append(arr[Integer.parseInt(tmp) - 1][1] + "\n");
			} else {
				int low = 0;
				int high = n - 1;
				while (low <= high) {
					int mid = (low + high) / 2;
					String t = arrTmp[mid][1].toString();
					int t2 = arrTmp[mid][1].toString().compareTo(tmp);
					if (arrTmp[mid][1].equals(tmp)) {
						sb.append((Integer.parseInt(arrTmp[mid][0].toString()) + 1) + "\n");
						
						break;
					} else if (arrTmp[mid][1].toString().compareTo(tmp) > 0) {
						high = mid - 1;
					} else {
						low = mid + 1;						
					}
				}
			}
		}
		
		System.out.print(sb.toString());
		
	}
}

