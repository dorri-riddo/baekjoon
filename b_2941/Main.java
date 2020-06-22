package b_2941;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		int length = str.length();
		
		while (length-- > 0) {
			if (length >= 1) {
				switch(str.substring(str.length() - length - 1, str.length() - length + 1)) {
					case "c=" :
					case "c-" :
					case "d-" :
					case "lj" :
					case "nj" :
					case "s=" :
					case "z=" :
						length--;
						break;
				}
			}
			
			if (length >= 2 && str.substring(str.length() - length - 1, str.length() - length + 2).equals("dz="))
				length -= 2;
			
			count++;
		}
		
		System.out.print(count);
	}

}
