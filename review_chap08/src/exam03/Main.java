package exam03;

public class Main {
	public static void main(String[] args) {
		Barracks b1 = new Barracks();
		b1.buildComplete(); // Building�� ����
		b1.lift(); // Liftable�� ����
		b1.repare(); // Repareable�� ����
		b1.generate(); // Generatable�� ����
		
		Building b2 = new Barracks();
		b2.buildComplete(); // Building�� ����
		b2.lift(); // Liftable�� ����
		b2.repare(); // Repareable�� ����
		b2.generate(); // Generatable�� ����
		
		Liftable b3 = new Barracks();
		((Barracks)b3).buildComplete(); // Building�� ����
		b3.lift(); // Liftable�� ����
		((Barracks)b3).repare(); // Repareable�� ����
		((Barracks)b3).generate(); // Generatable�� ����
		
	}

}
