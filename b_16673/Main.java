package b_16673;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int c = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		
		for (int i = 1; i <= c; i++) {
			sum = sum + k * i + p * i * i;
		}
		
		System.out.print(sum);

	}

}
