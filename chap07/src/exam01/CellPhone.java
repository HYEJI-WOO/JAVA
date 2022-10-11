package exam01;

// 상위,슈퍼,부모
public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원 on");
	}
	void powerOff() {
		System.out.println("전원 off");
	}
	void bell() {
		System.out.println("벨 울림");
	}
	void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	void receivevoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangUP() {
		System.out.println("전화 끊음");
	}

}
