package section2.exam01;

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println("���� ����� : " + calculator.plus(10, 15));
		System.out.println("������ ����� : " + calculator.divide(20, 6));

		calculator.powerOn();
		
		System.out.println("���� ����� : " + calculator.plus(10, 15));
		System.out.println("������ ����� : " + calculator.divide(20, 6));
		
		calculator.powerOff();
		
		// private�� ��ż� ���� �Ұ���
		// calculator.powerState = true;
		
		System.out.println("���� ����� : " + calculator.plus(10, 15));
		System.out.println("������ ����� : " + calculator.divide(20, 6));
		
		
	}

}

