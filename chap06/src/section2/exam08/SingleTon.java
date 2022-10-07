package section2.exam08;

public class SingleTon {
	
	private static SingleTon singleTon = new SingleTon();
	
	private SingleTon() { // public : ��𿡼��� ��밡��
		
	}
	
	public static SingleTon getInstance() {
		return singleTon;
	}

}

