package sec01;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("peach");
		list.add("banana");
		list.add("orange");
		list.add("lemon");
		
		// �ε�����ȣ�� ����
		list.remove(1); // peach ����
		System.out.println(list);
		
		// ������ ��ü ����
		list.remove("apple");
		System.out.println(list);
		
		// ����Ʈ�� ����ִ��� Ȯ��
		System.out.println(list.isEmpty());
		
		// ����Ʈ�� ��� ��ü ����
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);
	}

}
