package array_type;

import java.util.Iterator;

public class ArrayCreateByValueListEx5 {
	public static void main(String[] args) {
		// ����� �ʱ�ȭ�� �и��Ϸ��� �ʱ�ȭ�� new �����ڸ� ����ؾ��Ѵ�.
		int[] scores;
		scores = new int[] {100,70,50};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// �迭 ������ ���� ���Ҵ� �Ϸ��� new �����ڸ� ����ؾ��Ѵ�.
		String[] names = {"ȫ�浿","��浿"};
		names = new String[] {"�ڱ浿", "���浿"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
