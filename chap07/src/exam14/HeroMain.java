package exam14;

public class HeroMain {
	public static void main(String[] args) {
		Item i = new Item("방천화극", "공격력");
		Hero h = new Hero("여포", 10, i);
		h.printInfo();
		
		// Phone -> SmartPhone; (isA -> is kind of)
		// 스마트폰은 폰이다. (O)
		// 폰은 스마트폰이다. (X)
		// 인간은 포유류이다. (O)
		// 포유류는 인간이다. (X)
	}

}