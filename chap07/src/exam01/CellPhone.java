package exam01;

// ����,����,�θ�
public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("���� on");
	}
	void powerOff() {
		System.out.println("���� off");
	}
	void bell() {
		System.out.println("�� �︲");
	}
	void sendVoice(String message) {
		System.out.println("���� : " + message);
	}
	void receivevoice(String message) {
		System.out.println("���� : " + message);
	}
	void hangUP() {
		System.out.println("��ȭ ����");
	}

}
