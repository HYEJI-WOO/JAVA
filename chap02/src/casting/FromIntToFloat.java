package casting;

public class FromIntToFloat {
	public static void main(String[] args) {
		
		// �Ǽ� Ÿ�� = �����κ� + �Ҽ��κ�
		// ���� Ÿ�� = �����κ�
		
		int num1 = 1234567890;
		int num2 = 1234567890;
		float num3 = num2; // int -> float
		num2 = (int) num3; // float -> int
		System.out.println(num2); // 1234567936
		
		int result = num1 - num2;
		System.out.println(result);
		
	}

}