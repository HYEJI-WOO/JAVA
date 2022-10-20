package exam09;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	String color;
	
	static {
		info = model+company;
		// 인스턴스필드 초기화 안됨
		// 객체 생성의 보장이 없음
//		color = "빨강";
	}
	
	public Television() {
		info = company+model;
	}

}
