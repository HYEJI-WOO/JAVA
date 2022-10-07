package section2.exam07;

public class Card {
	
	int cardNumber; // ī�� ����(instance)
	static int cardWidth; // ī�� ���α���(static)
	static int cardHeight; // ī�� ���α���(static)
	// ī���� ����, ���α��̴� ��� ���� ������ ��������(static) ���
	
	public Card() {
		// ����, ������ ��� ��� ��� ����
		System.out.println(cardWidth); // ���� ��� ���
		this.cardNumber = 8; // ������ ��� ���
	}
	
	static {
		// ���� ��� ��� ����
		cardWidth = 90;
		cardHeight = 55;
		// ������ ��� ��� �Ұ���
//		carNumber = 10;
//		getCardMessage();
	}
	
	// static �޼ҵ�
	static void infoCardSize() {
		// ���� ��� ��� ����
		System.out.println(cardWidth);
		System.out.println(cardHeight);
		getMessage();
		// ������ ��� ��� �Ұ���
//		cardNumber = 10;
//		getCardNumber();
	}
	
	static void getMessage() {
		System.out.println("Hello");
	}
	
	// instance �޼ҵ�
	int getCardNumber() {
		// ���� , ������ ��� ��� ��� ����
		getMessage(); // ���� �޼ҵ�
		cardNumber = 100; // �ν��Ͻ� �ʵ�
		cardWidth = 80; // ���� �ʵ�
		cardHeight = 40; // ���� �ʵ�
		return this.cardNumber;
	}
	
	
	public static void main(String[] args) {
		infoCardSize();
//		Card card = new Card();
//		int result = card.getCardNumber();
//		System.out.println(result);
	}

}

//<���� ��� (static)>
//���� �ʵ�
//���� �޼ҵ�
//��ü���� ���� �������(������ ��밡��)

//<������ ��� (instance)>
//������
//�ν��Ͻ� �ʵ�
//�ν��Ͻ� �޼ҵ�
//��ü���� �Ŀ� ��밡��(���� ��Ͽ��� ��� x)

//<���� ���> - ��ü���� ����x
//����ƽ ���
//����ƽ �޼ҵ�

//<������ ���> - ��ü���� ����o
//������
//�ν��Ͻ� �޼ҵ�