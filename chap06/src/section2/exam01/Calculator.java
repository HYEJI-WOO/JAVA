package section2.exam01;

public class Calculator {
	
	// private을 통해 외부사용자가 마음대로 true, false를 바꿀 수 없도록 잠굼
	private boolean powerState;
	
	void powerOn() {
		System.out.println("전원을 켭니다");
		/* this.은 붙여도 되고 안붙여도 되고*/
		powerState = true;
	}
	
	void powerOff() { 
		System.out.println("전원을 끕니다");
		powerState = false;
	}
	
	int plus(int x, int y) {
		if(powerState) { // 전원이 켜져있다면
		//(!powerState) 전원이 꺼져있다면
			return x + y;			
			} 
		System.out.println("전원을 키고 사용하세요");
		return 0;
	}
	
	double divide(int x, int y) {
		if(powerState) {
			return (double)x/y;
			}
		System.out.println("전원을 키고 사용하세요");
		return 0; 
	}
}