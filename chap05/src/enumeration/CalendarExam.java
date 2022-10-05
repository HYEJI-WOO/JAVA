package enumeration;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// 객체생성 : new 연산자 - 여기서 만드는 것
		String str = new String("홍길동");

		// 만들어진걸 가져다 쓰는것 : new 연산자를 통해서 객체생성 불가능
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // MONTH : 0~11
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		// 대문자로 변경 ctrl+shift+x
		// 소문자로 변경 ctrl+shift+y
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year+"년 "+(month+1)+"월 "+day+"일");
		System.out.println(week);
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
	}

}
