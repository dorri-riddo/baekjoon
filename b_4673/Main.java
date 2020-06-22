package b_4673;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int[] array = new int[10001];
		for (int i = 1; i < 10000; i++) {
			if (isTrue(i, array))
				sb.append(i + "\n");
		}
		
		 System.out.print(sb.toString()); 

	}
	
	public static boolean isTrue(int num, int[] array) {
		boolean isTrue = true;
		
		for (int i = 1; i < num; i++) {
			if (array[i - 1] != 0) {
				if (array[i - 1] == num) { 
					isTrue = false;
					break;
				}
			}
			
			else {
				String strNum = "" + i;
				int sum = i;
				
				if (i < 10)
					sum += i;
				else 
					sum += i / Math.pow(10, strNum.length() - 1);

				int copyI = i;
				for (int j = 1; j < strNum.length(); j++) {
					sum += copyI % 10;
					copyI /= 10;
				}
				
				array[i - 1] = sum;
				
				if (array[i - 1] == num) {
					isTrue = false;
					break;
				}
			}
		}
		
		return isTrue;
	}

}
