package information;

public class MockExam2012 {
	public static void main(String[] args) {
		int[][] a = new int[10][8];
		int sum = 0;
		for(int i=5; i<6; i++) {
			for(int j=5; j<8; j++) {
				a[i][j] = i*j + 15;
				sum += a[i][j];
			}
		}
		double num = sum / a.length; // int³¢¸® ³ª´°¼ÀÀÌ¶ó ¸ò¸¸ ³ª¿È
		System.out.println(num);
		
	}

}
