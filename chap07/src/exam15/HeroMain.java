package exam15;

public class HeroMain {
	public static void main(String[] args) {
		Hero hero = new Hero("여포");
		Item s = new Sword("자웅일대검");
		hero.setItem(s);
		hero.info();
		
		System.out.println("====================");
		
		Item spear = new Spear("방천화극");
		hero.setItem(spear);
		hero.info();
		
	}

}