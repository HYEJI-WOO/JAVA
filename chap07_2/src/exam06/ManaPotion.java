package exam06;

public class ManaPotion extends Potion {
	
	int recovery = 30;

	@Override
	public void recovery(Hero hero) {
		int mp = hero.getMp();
		int maxmp = hero.getMaxMp();
		
		if (mp == maxmp) {
			System.out.println("더 이상 마나를 회복할 수 없습니다.");
			return;
		}
			mp += recovery;
			if (mp >= maxmp) {
				System.out.println("모든 마나가 회복되었습니다.");
				hero.setMp(maxmp);
				return;
			} 
			System.out.println("마나를 회복합니다.");
			hero.setMp(mp);
	 }
		
	}


