package exam02;

import exam01.Cellphone;

public class Smartphone extends Cellphone{
	
	String[] apps;

	Smartphone(String model, String color) {
		super(model, color);
	}
	
	void appPlay(String appName) {
		System.out.println("¾Û ½ÇÇà : " + appName);
	}

}
