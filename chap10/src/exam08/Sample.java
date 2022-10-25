package exam08;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("·Îµù Áß : ");
		for(int i=0; i<50; i++) {
			try {
				Thread.sleep(20);
				System.out.print(">");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
