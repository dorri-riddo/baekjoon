package b_10039;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int score = Integer.parseInt(bf.readLine());
			if (score < 40)
				score = 40;
			sum += score;
		}
		bf.close();

		System.out.print(sum / 5);
	}

}
