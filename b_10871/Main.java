package b_10871;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<>(); 
		
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			
			if (temp < X) 
				array.add(temp);
		}
		
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
	}
}
