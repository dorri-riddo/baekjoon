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
				//���� ��Ÿ�� ���ĺ����� Ȥ�� �����ؼ� ��Ÿ�� ���ĺ����� ���� (aa / ab �� ����) ������ ��쿣 ���
				if (str.charAt(i - 1) == str.charAt(i))
					continue;
				for (int j = 0; j < array.size(); j++) {	
					//���� ��Ÿ�� ���ĺ� ��쿡�� ������ �����ߴ� ���ĺ����� �Ǵ�. ������ �����ߴٸ� �׷� �ܾ �ƴϴ�
					if (str.charAt(i) == array.get(j)) {
						isTrue = false;
						break;
					} 
				}
				//���� ��Ÿ�� ���ĺ��� ������ �������� ���� ���ĺ��̱⿡ ���Ӱ� �迭�� �߰�
				if (isTrue)
					array.add(str.charAt(i));				
			}
			
			//�� �Ǵ� ���ο��� �ɸ��� �ʾҴ���� �׷� �ܾ ����
			if (isTrue) {
				count++;
			}
		}
		
		System.out.print(count);

	}

}
