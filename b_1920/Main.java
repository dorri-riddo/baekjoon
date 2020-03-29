package b_1920;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());		
		int[] arr = new int[n];
		StringTokenizer st;
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(bf.readLine());		
		int[] arr2 = new int[m];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		bf.close();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr2.length; i++) {
			sb.append(search(arr, arr2[i]) + "\n");
		}
		
		System.out.println(sb.toString());
	}
	
	static public int search(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k)
				return 1;
		}
		return 0;
	}
}
