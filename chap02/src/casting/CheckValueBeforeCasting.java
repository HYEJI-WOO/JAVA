package casting;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		// or ||
		// and &&
		
		int i = 0;
		
		// Byte.MIN_VALUE = -128
		// Byte.MAX_VALUE = 127
		// ���ǽ� : i < -128 OR i > 127
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			//byte ���� ������ �Ѿ� ����.
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�");
		} else {
			//byte ���� ���� ���� �ִ�.
			byte b = (byte) i;
			System.out.println(b);
		}
	}
	
}