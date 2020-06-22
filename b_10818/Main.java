package b_10818;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		
		array[0] = sc.nextInt();
		
		int max = array[0];
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			array[i] = sc.nextInt();
			
			if (array[i] < min)
				min = array[i];
			if (array[i] > max)
				max = array[i];
		}
		
		System.out.println(min + " " + max);
	
	}

}
