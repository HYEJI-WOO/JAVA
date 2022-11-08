package sec03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// 지정된 방법으로 정렬
		// 문자열 길이 오름차순
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
		
		// 문자열 길이 내림차순
		list.sort((o1,o2)->{
			return o2.length()-o1.length();
		});
		System.out.println(list);
		
		// 문자열 길이 오름차순
		list.sort((o1,o2)->o1.length()-o2.length());
		System.out.println(list);
	}

}
