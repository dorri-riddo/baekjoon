package b_1026;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(bf.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		bf.close();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[n - 1 - i];
		}
		System.out.print(sum);
	}

}
