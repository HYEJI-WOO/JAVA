package exam03.test02;

import java.util.ArrayList;
import java.util.List;

import exam03.test01.CellPhone;

public class SmartPhone extends CellPhone {
		
	public List<String> apps;
	
	public SmartPhone() {
		apps = new ArrayList<String>();
		apps.add("YouTube");
		apps.add("PlayStore");
	}
	
	public void appExecute(String appName) {
		if(!isPowerOn(this.power)) return;
		for(String app : apps) {
			if(app!=null && app.equals(appName)) {
				System.out.println(appName + " ���� �����մϴ�.");
				return;
			}
		}
		System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
	}
	
	public void appDownload(String appName) {
		this.apps.add(appName);
	}

}
