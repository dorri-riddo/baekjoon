package b_5598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			char ch;
			if (arr[i] == 'A')
				ch = 'X';
			else if (arr[i] == 'B')
				ch = 'Y';
			else if (arr[i] == 'C')
				ch = 'Z';
			else
				ch = (char) (arr[i] - 3);
			System.out.print(ch);
		}

	}

}
