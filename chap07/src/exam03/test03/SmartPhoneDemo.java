package exam03.test03;

import java.util.Arrays;

import exam03.test02.SmartPhone;

public class SmartPhoneDemo {
	public static void main(String[] args) {
		
		SmartPhone sm = new SmartPhone();
		sm.setPower(true);
		sm.makeAPhoneCall("01025421454");
		sm.appExecute("YouTube");
		
		sm.appDownload("Naver");
		sm.appDownload("Google");
		sm.appDownload("Instagram");
		sm.appDownload("Facebook");
		System.out.println(sm.apps);
				
	}

}
