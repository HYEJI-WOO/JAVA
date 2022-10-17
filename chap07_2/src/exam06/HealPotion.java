package exam06;

public class HealPotion extends Potion {
	int recovery = 70;
	
	@Override
	public void recovery(Hero hero) {
		int hp = hero.getHp();
		int maxhp = hero.getMaxHp();
		if(hp == maxhp) {
			System.out.println();
			System.out.println("더 이상 생명력을 회복할 수 없습니다.");
			return;
		}
		hp += this.recovery; // 생명력 회복
		if(hp >= maxhp) { // 초과 회복의 경우
			System.out.println();
			System.out.println("모든 생명력이 회복되었습니다.");
			hero.setHp(maxhp);
			return; // 최대 생명력 반환
		}
		hero.setHp(hp);
		System.out.println();
		System.out.println("생명력을 회복합니다.");
	}

} 