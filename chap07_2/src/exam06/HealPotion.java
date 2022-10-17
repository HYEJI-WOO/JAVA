package exam06;

public class HealPotion extends Potion {
	int recovery = 70;
	
	@Override
	public void recovery(Hero hero) {
		int hp = hero.getHp();
		int maxhp = hero.getMaxHp();
		if(hp == maxhp) {
			System.out.println();
			System.out.println("�� �̻� ������� ȸ���� �� �����ϴ�.");
			return;
		}
		hp += this.recovery; // ����� ȸ��
		if(hp >= maxhp) { // �ʰ� ȸ���� ���
			System.out.println();
			System.out.println("��� ������� ȸ���Ǿ����ϴ�.");
			hero.setHp(maxhp);
			return; // �ִ� ����� ��ȯ
		}
		hero.setHp(hp);
		System.out.println();
		System.out.println("������� ȸ���մϴ�.");
	}

} 