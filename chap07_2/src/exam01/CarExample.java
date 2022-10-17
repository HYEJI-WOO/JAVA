package exam01;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 10);
				break;
			case 2:
				System.out.println("�տ����� �ѱ�Ÿ�̾�� ��ü");
				car.frontRightTire = new HankookTire("�տ�����", 10);
				break;
			case 3:
				System.out.println("�ڿ��� ��ȣŸ�̾�� ��ü");
				car.backLeftTire = new KumhoTire("�ڿ���", 10);
				break;
			case 4:
				System.out.println("�ڿ����� �ѱ�Ÿ�̾�� ��ü");
				car.backRightTire = new HankookTire("�ڿ�����", 10);
				break;
			}
			System.out.println("===================");
		}
	}

}
