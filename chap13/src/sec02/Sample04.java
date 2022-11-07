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
		
		// 저장된 객체의 인덱스 반환, 해당객체가 없으면 -1 반환
		// 왼쪽에서 오른쪽으로 검색, 최초 발견 인덱스 반환
		int idx1 = list.indexOf("apple"); // 0 
		int idx2 = list.indexOf("melon"); // -1
		System.out.println(idx1);
		System.out.println(idx2);
		
		// 오른쪽에서 왼쪽으로 검색
		int idx3 = list.lastIndexOf("apple");
		System.out.println(idx3);
		
		// 해당객체가 포함되어 있는지 여부
		// 조건문 사용 가능
		boolean contains = list.contains("apple");
		boolean contains2 = list.contains("melon");
		System.out.println("apple 포함? " + contains);
		System.out.println("melon 포함? " + contains2);
	}

}
