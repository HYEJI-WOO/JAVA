package exam01;

public abstract class Dummy implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("전원 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("전원 끔");
	}
	
	// setVolume(int volume) 메소드를 구현하지 않았다.
	// 이 경우 이 클래스는 추상클래스가 된다.


}
