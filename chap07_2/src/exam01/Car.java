package exam01;

public class Car {
	// hasA
	Tire[] tires; 
	
	public Car(Tire[] tires) {
		this.tires = tires;
	}
	
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
