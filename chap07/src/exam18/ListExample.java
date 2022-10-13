package exam18;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		// List 인터페이스
		// 구현클래스 : ArrayList, LinkedList
		List<String> list = new ArrayList<String>();
		list.add("고길동");
		list.add("둘리");
		list.add("희동");
		list.add("도우너");
		System.out.println(list);
		
		// Object타입을 매개변수로 받는다.
		// Object타입에 할당될수 있는 자료타입 : 모든 자료타입이 가능함
		// remove(Object o)
		list.remove("도우너");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		
		
	}

}
