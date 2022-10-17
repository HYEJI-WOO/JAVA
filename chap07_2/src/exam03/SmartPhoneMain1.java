package exam03;

public class SmartPhoneMain1 {
	public static void main(String[] args) {
		Phone phone = new Phone();
//		SmartPhone sm = (SmartPhone) phone;
		
		Phone ph2 = new SmartPhone();
//		ph2.playApp("À¯Æ©ºê");
		SmartPhone sm2 = (SmartPhone) ph2;
		ph2.makeAPhoneCall();
		sm2.playApp("À¯Æ©ºê");
	}

}
