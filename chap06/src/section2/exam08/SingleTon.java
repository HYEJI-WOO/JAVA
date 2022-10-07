package section2.exam08;

public class SingleTon {
	
	private static SingleTon singleTon = new SingleTon();
	
	private SingleTon() { // public : 어디에서나 사용가능
		
	}
	
	public static SingleTon getInstance() {
		return singleTon;
	}

}

