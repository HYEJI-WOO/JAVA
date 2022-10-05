package if_exam;

public class MathRandomExample {
	public static void main(String[] args) {
		// 0 < random < 1
		// 0 + 1 < random*6 + 1 < 6 + 1
		int dice = (int)(Math.random()*6) + 1;
		int lotto = (int)(Math.random()*45) + 1;
 		System.out.println(dice); // 1~6 정수
		System.out.println(lotto); // 1~45 정수
	}

}