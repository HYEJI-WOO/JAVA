package while_exam;

public class WhileSumExample {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while((sum += ++i)<=100) {
			System.out.println(i + "-" + "���� �հ� : " + sum);
			
//		int sum2 = 0;
//		int i2 = 1;
//		
//		while((sum2 += i2)<=100) {
//			System.out.println(i2 + "-" + "���� �հ� : " + sum2);
//			i++;
//		}
		
		}
		
	}

}
