package b_15651;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		bf.close();
		
		func(n, m, "", 0);
	}
	
	static public void func(int n, int m, String str, int pos) {
		if (pos == m) {
			System.out.println(str);
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			func(n, m, str + i + " ", pos + 1);
		}
	}
}
