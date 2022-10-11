package exam03.test03;

import exam03.test02.SmartPhone;

public class SmartPhoneDemo {
	public static void main(String[] args) {
		
		SmartPhone sm = new SmartPhone();
		sm.setPower(true);
		sm.makeAPhoneCall("01025421454");
		sm.appExecute("YouTube");
				
	}

}
