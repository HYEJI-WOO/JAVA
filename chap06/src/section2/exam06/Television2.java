package section2.exam06;

public class Television2 {
	static String company;
	static String model;
	static String info; // static 필드 공유
	String color; // instance 필드 독립
	
	static { // 정적 블록
		company = "삼성";
		model = "LCD";
		info = company + "_" + model;
		// color = "red"; 
	}
	
	public static void main(String[] args) {
		System.out.println(Television2.company);
		System.out.println(model);
		System.out.println(info);
	}
}

