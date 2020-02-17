package b_1157;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/11022
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] array = {"A0", "B0", "C0", "D0", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "M0", "N0", "O0", "P0", "Q0", "R0", "S0", "T0", "U0", "V0", "W0", "X0", "Y0", "Z0"};
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < array.length; j++) {
				if (str.indexOf(array[j].charAt(0), i) == i || str.charAt(i) == (char)(array[j].charAt(0) + 32)) {
					array[j] = "" + array[j].charAt(0) + (Integer.parseInt(array[j].substring(1)) + 1);
					break;
				}
					
			}
		}
		
		String result = "A0";
		
		for (int i = 0; i < array.length; i++) {
			if (Integer.parseInt(array[i].substring(1)) > Integer.parseInt(result.substring(1)))
				result = array[i];
		}
		
		for (int i = 0; i < array.length; i++) {
			if (result.charAt(0) == array[i].charAt(0))
				continue;
			if (Integer.parseInt(array[i].substring(1)) == Integer.parseInt(result.substring(1))) {
				result = "?";
				break;
			}			
		}
		
		System.out.print(result.charAt(0));
	}

}
