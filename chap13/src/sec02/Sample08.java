package sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// �ݺ���
		Iterator<String> it = list.iterator();
		// while���� ���� �ݺ�
		while(it.hasNext()) { // �ݺ��� ���� ��Ұ� �ִٸ�
			System.out.println(it.next()); // ������� ���
		}
		
		// 1ȸ �ݺ��� ������ �ݺ��� ��ü�� �� �̻� �ݺ����� �ʴ´�.
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}