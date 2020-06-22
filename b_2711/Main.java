package b_2711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while (T-- > 0) {
			st = new StringTokenizer(bf.readLine());
			int p = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for (int i = 0; i < str.length(); i++) {
				if (i + 1 == p) {
					continue;
				}					
				sb.append(str.charAt(i));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}

}
