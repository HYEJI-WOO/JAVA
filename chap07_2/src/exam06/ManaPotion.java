package exam06;

public class ManaPotion extends Potion {
	
	int recovery = 30;

	@Override
	public void recovery(Hero hero) {
		int mp = hero.getMp();
		int maxmp = hero.getMaxMp();
		
		if (mp == maxmp) {
			System.out.println("�� �̻� ������ ȸ���� �� �����ϴ�.");
			return;
		}
			mp += recovery;
			if (mp >= maxmp) {
				System.out.println("��� ������ ȸ���Ǿ����ϴ�.");
				hero.setMp(maxmp);
				return;
			} 
			System.out.println("������ ȸ���մϴ�.");
			hero.setMp(mp);
	 }
		
	}


