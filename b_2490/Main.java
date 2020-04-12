package b_2490;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(bf.readLine());
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			switch (sum) {
			case 0:
				sb.append("D" + "\n");
				break;
			case 1:
				sb.append("C" + "\n");
				break;
			case 2:
				sb.append("B" + "\n");
				break;
			case 3:
				sb.append("A" + "\n");
				break;
			case 4:
				sb.append("E" + "\n");
				break;
			}
		}
		bf.close();
		
		System.out.print(sb.toString());
	}
}
