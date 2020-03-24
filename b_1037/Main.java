package b_1037;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] array = new int[n];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		bf.close();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		
		StringBuilder sb = new StringBuilder();
		if (array.length % 2 == 0)
			sb.append(array[0] * array[array.length - 1]);
		else 
			sb.append((int) Math.pow(array[array.length / 2], 2));
		System.out.print(sb.toString());
	}
}
