package enumeration;

import java.util.Arrays;
import java.util.Iterator;

public class EnumMethodExample {
	public static void main(String[] args) {
		Week[] weeks = Week.values();
//		System.out.println(weeks.length);
		System.out.println(Arrays.toString(weeks));
		
		for(Week w : weeks) {
			if(w != Week.SATURDAY) {
			System.out.print(w + ", ");
			} else {
				System.out.println(w + " ");
			}
	}
		Week day1 = Week.valueOf("SUNDAY");
		System.out.println(day1);
		// 대소문자 구분, 없으면 예외발생 : IllegalArgumentException
//		Week day2 = Week.valueOf("Sunday");
//		System.out.println(day2);

	} 
}
