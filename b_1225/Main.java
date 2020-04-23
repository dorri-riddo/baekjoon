package b_1225;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)  throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		bf.close();
		
		long sum = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				sum += (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
			}
		}
		
		System.out.print(sum);

	}
}
