package exam01;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 0; i < 5; i++) {
			// ��ũ�� �� Ÿ�̾� ���� ��ȯ
			int problemLocation = car.run();
			if(problemLocation!=0) {
				System.out.println(
					car.tires[problemLocation-1].location + " �ѱ�Ÿ�̾�� ��ü");
				car.tires[problemLocation-1] =
					new HankookTire(car.tires[problemLocation-1].location, 10);
			}
			System.out.println("===================");
		}
	}

}
