package casting;

public class CastingExample {
	public static void main(String[] args) {
		// ����Ÿ�� : int(4byte) -> char(2byte)
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		// ����Ÿ�� : long(8byte) -> int(4byte)
		long longValue = 5000000000L;
		intValue = (int) longValue; // ������ �ս�
		System.out.println(intValue);
		
		// 
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // ������ �ս�
		System.out.println(intValue);
		
		
	}

}
