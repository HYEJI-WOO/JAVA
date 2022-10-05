package enumeration;

public class WeekExam {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		// name() 이름
		String name = today.name();
		System.out.println(name); // name메소드 사용
		System.out.println(today); // 그냥 출력
		
		// ordinal() 순번
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		System.out.println(Week.FRIDAY.ordinal());
		
		// 열거 객체 비교
		Week day1 = Week.MONDAY; // 1
		Week day2 = Week.WEDNESDAY; // 3
		
		// 상대적 위치 인수(기준)
		// day1은 day2를 기준으로 어디에 위치해있는가
		int result1 = day1.compareTo(day2); // MONDAY(1)-WEDNESDAY(3)
		
		// day2는 day1을 기준으로 어디에 위치해있는가
		int result2 = day2.compareTo(day1); // WEDNESDAY(3)-MONDAY(1)
		
		System.out.println(result1); // -2
		System.out.println(result2); // 2
	}
}