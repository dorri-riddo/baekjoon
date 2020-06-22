package b_1316;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		
		while(N-- > 0) {
			String str = sc.next();

			ArrayList<Character> array = new ArrayList<Character>();
			array.add(str.charAt(0));
			boolean isTrue = true;
			for (int i = 1; i < str.length(); i++) {
				if (!isTrue)
					break;
				//새로 나타난 알파벳인지 혹은 연속해서 나타난 알파벳인지 구별 (aa / ab 를 구별) 연속인 경우엔 통과
				if (str.charAt(i - 1) == str.charAt(i))
					continue;
				for (int j = 0; j < array.size(); j++) {	
					//새로 나타난 알파벳 경우에는 기존에 등장했던 알파벳인지 판단. 기존에 등장했다면 그룹 단어가 아니다
					if (str.charAt(i) == array.get(j)) {
						isTrue = false;
						break;
					} 
				}
				//새로 나타난 알파벳이 기존에 등장하지 않은 알파벳이기에 새롭게 배열에 추가
				if (isTrue)
					array.add(str.charAt(i));				
			}
			
			//위 판단 여부에서 걸리지 않았더라면 그룹 단어가 맞음
			if (isTrue)
				count++;
		}
		
		System.out.print(count);

	}

}
