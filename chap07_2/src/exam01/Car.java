package exam01;

public class Car {
	// hasA
	Tire[] tires = {
			new Tire("�տ���", 6),
			new Tire("�տ�����", 2),
			new Tire("�ڿ���", 3),
			new Tire("�ڿ�����", 4),			
	};
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		for (int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) { // ��ũ�� �����
				stop();
				return i+1; // ��ũ�� Ÿ�̾� ��ȣ ��ȯ
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
