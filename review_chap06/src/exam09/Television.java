package exam09;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	String color;
	
	static {
		info = model+company;
		// �ν��Ͻ��ʵ� �ʱ�ȭ �ȵ�
		// ��ü ������ ������ ����
//		color = "����";
	}
	
	public Television() {
		info = company+model;
	}

}
