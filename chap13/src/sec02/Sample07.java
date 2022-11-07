package sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample07 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// 반복자
		Iterator<String> it = list.iterator();
		// while문을 통한 반복
		while(it.hasNext()) { // 반복할 다음 요소가 있다면
			System.out.println(it.next()); // 다음요소 출력
		}
		
		// 1회 반복을 수행한 반복자 객체는 더 이상 반복되지 않는다.
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println("실행되지 않는다. ");
		}
		
	}

}
