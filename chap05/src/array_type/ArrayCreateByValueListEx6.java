package array_type;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayCreateByValueListEx6 {
	public static void main(String[] args) {
		int[] myArr = {10,20,30,40};
		int addALL = addALL(myArr);
		System.out.println(addALL);
		
		// �迭�� ��� ���� ���� ó�� ������ �� ����.
//		int result = addALL({10,20,30}); // ������ ����
		
		// �迭�� ����� �����Ϸ��� new �����ڸ� ����ؾ��Ѵ�.
		int result = addALL(new int[] {10,20,30});
		System.out.println(result);
		
	}
	
	public static int addALL(int[] arr) { // {10,20,30,40}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
