package exam15;

public class HeroMain {
	public static void main(String[] args) {
		Hero hero = new Hero("����");
		Item s = new Sword("�ڿ��ϴ��");
		hero.setItem(s);
		hero.info();
		
		System.out.println("====================");
		
		Item spear = new Spear("��õȭ��");
		hero.setItem(spear);
		hero.info();
		
	}

}