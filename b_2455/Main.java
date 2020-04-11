package b_2455;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(bf.readLine());
			
			sum -= Integer.parseInt(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
			
			if (max < sum)
				max = sum;
		}
		
		System.out.print(max);

	}
}
