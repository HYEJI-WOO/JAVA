package exam02;

import exam01.CellPhone;

public class SmartPhone extends CellPhone {
	
	void appExecute() {
		System.out.println("앱을 실행합니다.");
		powerOn(); // protected = extends로 상속받은 클래스 내에서만 사용가능
	}
	

}
