package b_5543;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] burger = new int[3];
		int[] drink = new int[2];
		
		for (int i = 0; i < burger.length; i++) {
			burger[i] = sc.nextInt();
		}
		for (int i = 0; i < drink.length; i++) {
			drink[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.print(min(min(burger[0], burger[1]), burger[2]) + min(drink[0], drink[1]) - 50);

	}
	
	public static int min(int x, int y) {
		if (x > y)
			return y;
		else
			return x;
	}

}
