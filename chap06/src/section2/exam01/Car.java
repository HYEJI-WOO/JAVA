package section2.exam01;

public class Car {
	
	// instance �޼ҵ�, ������ �޼ҵ�
	// non-static �޼ҵ�
	// ��ü�� �������� ����
	// ��ü ���� �� ȣ�� ��
	// ���������� ���� ȣ�� car.run()
	int run(String message) {
		System.out.println("run�޼ҵ� ����");
		System.out.println("���޵� �Ű��� : " + message);
		return message.length();
	}
	void stop() {
		System.out.println("stop�޼ҵ� ����");
	}
	void sound() {
		System.out.println("sound�޼ҵ� ����");
	}
	
	// static �޼ҵ�
	// ���� �޼ҵ�
	// ��ü ���� ������ ���� ���� ����� �� ����
	// Ŭ������.�޼ҵ�� Car.isLeftGas()
	static void isLeftGas() {
		System.out.println("isLeftGas");
	}

}