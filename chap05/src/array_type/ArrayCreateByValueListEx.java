package array_type;

public class ArrayCreateByValueListEx {
	public static void main(String[] args) {
		// �迭�� ����� �ʱ�ȭ
		int[] scores = {83, 90, 87, 70, 75};
		
		// �迭 ��ҿ� ����
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		int score2 = scores[2]; // 87
		System.out.println(score2);
		int score3 = scores[3];
		System.out.println(score3);
		int score4 = scores[4];
		System.out.println(score4);
	}

}
