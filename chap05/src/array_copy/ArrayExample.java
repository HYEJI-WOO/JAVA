package array_copy;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		
		// ���� �迭
		String[] oldStrArr = {"java", "mysql", "jsp", "oracle", "spring"};
		String[] newStrArr = new String[6];
		
		// �����迭���� ���ο� �迭�� "mysql", "jsp", "oracle" �����Ͽ�
		// [null, null, mysql, jsp, oracle, null] �ش����� ��������
		
		System.arraycopy(oldStrArr, 1, newStrArr, 2, 3);
		// (���� �迭, 
		//  ���� �迭�� �� �� �ε������� ���� ����,
		//  ���ο� �迭,
		//  ���ο� �迭�� �� �� �ε������� �ٿ� ������, 
		//  �� ���� �׸��� ��������);
		System.out.println(Arrays.toString(newStrArr));
		
		// ����� �迭�� ���� �迭�� ������ ��ü�� �����Ѵ�.
		System.out.println(oldStrArr[1]==newStrArr[2]);
		System.out.println(oldStrArr[2]==newStrArr[3]);
		System.out.println(oldStrArr[3]==newStrArr[4]);
	}

}
