package section2.exam08;

import java.util.Calendar;

import section2.exam07.Card;

public class SingleTonExam {
	public static void main(String[] args) {
//		Card card1 = new Card();
//		Card card2 = new Card();
//		System.out.println(card1);
//		System.out.println(card2);
//		
//		Calendar calender = new Calendar(); : ¾ÈµÊ
//		Calendar calendar = Calendar.getInstance();
		
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1==obj2);
		
	}

}
