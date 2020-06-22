package b_1152;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int count = 0;
		
		while(st.hasMoreTokens()) {
			count++;
			st.nextToken();
		}
		
		System.out.print(count);

	}

}
