package section2.exam06;

public class Television2 {
	static String company;
	static String model;
	static String info; // static �ʵ� ����
	String color; // instance �ʵ� ����
	
	static { // ���� ���
		company = "�Ｚ";
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

