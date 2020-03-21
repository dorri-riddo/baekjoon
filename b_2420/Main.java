package b_2420;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		bf.close();
		
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		sb.append(Math.abs(n - m));
		System.out.print(sb.toString());
	}

}
