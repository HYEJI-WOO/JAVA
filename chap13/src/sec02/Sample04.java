package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("apple");
		list.add("orange");
		System.out.println(list);
		
		// ����� ��ü�� �ε��� ��ȯ, �ش簴ü�� ������ -1 ��ȯ
		// ���ʿ��� ���������� �˻�, ���� �߰� �ε��� ��ȯ
		int idx1 = list.indexOf("apple"); // 0 
		int idx2 = list.indexOf("melon"); // -1
		System.out.println(idx1);
		System.out.println(idx2);
		
		// �����ʿ��� �������� �˻�
		int idx3 = list.lastIndexOf("apple");
		System.out.println(idx3);
		
		// �ش簴ü�� ���ԵǾ� �ִ��� ����
		// ���ǹ� ��� ����
		boolean contains = list.contains("apple");
		boolean contains2 = list.contains("melon");
		System.out.println("apple ����? " + contains);
		System.out.println("melon ����? " + contains2);
	}

}
