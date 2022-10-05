package ref_type;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String var1 = "김길동";
		String var2 = "홍길동";
		if(var1!=null) {
			System.out.println(var1.equals(var2));
		}
		String str = null;
		int size = str.length(); // NullPointerException 발생
		System.out.println(size);
		System.out.println("메인 종료");
	}
}
