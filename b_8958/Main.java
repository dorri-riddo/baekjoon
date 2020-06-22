package b_8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0) {
			String quiz = sc.next();
			
			int count = 0;
			int score = 0;
			for (int i = 0; i < quiz.length(); i++) {
				if (quiz.substring(i, i+1).equals("O")) 
					score += ++count;
				else 
					count = 0;
			}
			
			System.out.println(score);
		}
		
	}
}
