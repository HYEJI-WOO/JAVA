package primitive;

public class PrimitiveTypeMaxAndMin {
	public static void main(String[] args) {
		System.out.println("byte타입 최솟값 : "+Byte.MIN_VALUE);
		System.out.println("byte타입 최댓값 : "+Byte.MAX_VALUE);
		byte minValue = -128;
		byte maxValue = 127;
		
		System.out.println((int)Character.MIN_VALUE); // 공백 문자
		System.out.println((int)Character.MAX_VALUE); // ?
		
		System.out.println("short 타입 최솟값 : " +Short.MIN_VALUE);
		System.out.println("short 타입 최댓값 : " +Short.MAX_VALUE);
		short minshValue = -32768;
		short maxshValue = 32767;
		
		System.out.println("int 타입 최솟값 : " + Integer.MIN_VALUE);
		System.out.println("int 타입 최댓값 : " + Integer.MAX_VALUE);
		
		System.out.println("float 타입 최솟값 : " + Float.MIN_VALUE);
		System.out.println("float 타입 최솟값 : " + Float.MIN_VALUE);
		
		System.out.println("double 타입 최솟값 : " + Double.MIN_VALUE);
		System.out.println("double 타입 최솟값 : " + Double.MIN_VALUE);
		
		
	}

}
