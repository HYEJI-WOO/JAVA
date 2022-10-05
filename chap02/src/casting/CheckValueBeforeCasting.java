package casting;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		// or ||
		// and &&
		
		int i = 0;
		
		// Byte.MIN_VALUE = -128
		// Byte.MAX_VALUE = 127
		// 조건식 : i < -128 OR i > 127
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			//byte 저장 범위를 넘어 선다.
			System.out.println("byte타입으로 변환할 수 없습니다");
		} else {
			//byte 저장 범위 내에 있다.
			byte b = (byte) i;
			System.out.println(b);
		}
	}
	
}