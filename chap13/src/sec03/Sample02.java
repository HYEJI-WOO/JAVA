package sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		System.out.println(list);
		
		// 역순 정렬
		Collections.reverse(list);
		System.out.println(list);
		
		// 기본 정렬 - 문자열:사전,  숫자:오름차순
		Collections.sort(list);
		System.out.println(list);
	}
}
