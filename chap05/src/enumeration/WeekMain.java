package enumeration;

public class WeekMain {
	public static void main(String[] args) {
//		Week today; // 열거타입 선언
//		today = Week.MONDAY; // 열거 상수 할당
		Week today = Week.MONDAY;
		// today 스택 영역
		// Week.MONDAY 메소드 영역(모든스레드에서 공유가능)
		// MONDAY 열거객체(힙 영역)

		System.out.println(today);
		Week birthday = null; // 참조타입이기 때문에 null값 할당 가능
		
	}

}
