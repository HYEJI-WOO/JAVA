package for_exam;

public class GugudanExample {
	public static void main(String[] args) {
		
		for(int m=2; m<=3; m++) {
			System.out.println(m + "단 시작"); 
			for(int n=1; n<=9; n++) {
				System.out.println(m + "*" + n + "=" + m*n );
			}
			System.out.println(); // 한 단이 끝나면 개행
		}
	}
}
