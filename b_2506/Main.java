package b_2506;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int sum = 0;
		int cnt = 1;
		bf.close();
		
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(st.nextToken()) == 1) 
				sum += cnt++;
			
			else
				cnt = 1;
		}
		
		System.out.print(sum);
	}
}
