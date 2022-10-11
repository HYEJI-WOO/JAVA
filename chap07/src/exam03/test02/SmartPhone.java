package exam03.test02;

import exam03.test01.CellPhone;

public class SmartPhone extends CellPhone {
		
	private String[] apps;
	
	public SmartPhone() {
		apps = new String[10];
		apps[0] = "YouTube";
		apps[1] = "PlayStore";
		apps[2] = "Naver";
	}
	
	public void appExecute(String appName) {
		if(!isPowerOn(this.power)) return;
		for(String app : apps) {
			if(app!=null && app.equals(appName)) {
				System.out.println(appName + " ���� �����մϴ�.");
				return;
			}
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
			return;
		}
	}

}
