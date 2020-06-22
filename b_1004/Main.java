package b_1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int temp[] = new int[t];
		
		while(t > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int n = sc.nextInt();
			
			int result = 0;
			
			//행성 내부에 있을 때에만 진입/탈출이 발생
			//각 행성의 원점과 출발점/도착점까지의 거리가 각 행성의 반지름보다 작거나 같을 경우에 그 행성의 내부에 있는 셈 
			while (n > 0) {
				int cx = sc.nextInt();
				int cy = sc.nextInt();
				int r = sc.nextInt();
				
				//행성 내부에 출발점/도착점이 동시에 있을 때
				if(Math.sqrt(Math.pow((x1 - cx), 2) + Math.pow((y1 - cy), 2)) <= r && Math.sqrt(Math.pow((x2 - cx), 2) + Math.pow((y2 - cy), 2)) <= r) {
					n--;
					continue;
				} 
				//출발점은 행성 탈출만 있다
				if(Math.sqrt(Math.pow((x1 - cx), 2) + Math.pow((y1 - cy), 2)) <= r) {
					result++;
				}		
				//도착점은 행성 진입만 있다
				if(Math.sqrt(Math.pow((x2 - cx), 2) + Math.pow((y2 - cy), 2)) <= r) {
					result++;
				}
				
				n--;
			}
			
			temp[temp.length - t] = result;
			
			t--;
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

}
