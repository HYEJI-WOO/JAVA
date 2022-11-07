package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple"); //0
		list.add("kiwi"); //1
		list.add("grape"); //2
		list.add("banana"); //3
		list.add("orange"); //4
		
		List<String> subList = list.subList(1, 3);
		System.out.println(subList);
		
		List<String> subList2 = list.subList(0, list.size());
		System.out.println(subList2);
		
		
	}

}
