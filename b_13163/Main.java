package b_13163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(n-- > 0) {
			sb.append("god");
			String str = bf.readLine();
			st = new StringTokenizer(str);
			st.nextToken();
			
			while(st.hasMoreTokens()) {
				sb.append(st.nextToken());
			}
			sb.append("\n");
		}
		bf.close();
		
		System.out.print(sb.toString());
	}
}
