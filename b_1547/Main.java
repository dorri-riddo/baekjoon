package b_1547;

import java.util.Scanner;

public class Main {
	
	static int[] loc = new int[3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		loc[0] = 1;
		
		while (n-- > 0) {
			swap(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		for (int i = 0; i < loc.length; i++) {
			if (loc[i] == 1) {
				System.out.print(i + 1);
				break;
			}
		}
	}
	
	static public void swap(int i, int j) {
		int tmp = loc[i - 1];
		loc[i - 1] = loc[j - 1];
		loc[j - 1] = tmp;
	}

}
