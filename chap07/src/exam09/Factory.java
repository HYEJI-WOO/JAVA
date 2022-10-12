package exam09;

import java.util.ArrayList;

public class Factory extends GenBuilding{

	public Factory(int hp, int buildTime) {
		super(hp, buildTime);
	}

	@Override
	public void setunitList() {
		this.unitList = new ArrayList<String>();
		this.unitList.add("¹úÃÄ");
		this.unitList.add("ÅÊÅ©");
		this.unitList.add("°ñ¸®¾Ñ");
	}
	

}