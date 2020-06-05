package b_17294;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		boolean flag = true;
		
		if (str.length() > 1) {
			int diff = (str.charAt(1) - '0') - (str.charAt(0) - '0');
			for (int i = 1; i < str.length() - 1; i++) {
				if ((str.charAt(i + 1) - '0') - (str.charAt(i) - '0') != diff) {
					flag = false;
					break;
				}
			}
		}
		
		if (flag) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
		} else {
			System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
		}
	}
	
}
