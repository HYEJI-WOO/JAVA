package exam01;

public class TVMain {
	public static void main(String[] args) {
//		Television tv = new Television();
		// 인터페이스(RemoteControl) 타입은 
		// 구현객체(Television)의 상위타입이 될 수 있다.
		RemoteControl tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(100);
		tv.setVolume(-10);
		tv.setVolume(5);
		tv.setMute(false); // 디폴트메소드
		System.out.println();
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(100);
		audio.setVolume(-10);
		audio.setVolume(5);
		audio.setMute(false); // 디폴트메소드
	}

}
