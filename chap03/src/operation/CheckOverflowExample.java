package operation;

public class CheckOverflowExample {
	public static void main(String[] args) {
		// ���� �������� �����÷ο� �߻� ���ɼ�
		// �� ������ ��ȣ�� ���� ����
		int d = 2100000000;
		
		try {
			int result = safeAdd(2100000000,2100000000); // ���ܹ߻� ���ɼ� ����
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // ���� Ŭ������ ����� �޼��� ���
		}
	}

	private static int safeAdd(int left, int right) {
		boolean allPositive = left>0 && right>0; // ��� ����� ���
		boolean allNegative = left<0 && right<0; // ��� ������ ���
		
		// ������ true�� �����÷ο� �߻���
		boolean maxBounded =  allPositive && left > Integer.MAX_VALUE - right;
		boolean minBounded = allNegative && right < Integer.MIN_VALUE - left; 
		
		if(maxBounded || minBounded) {
			// ���ܴ���
			throw new ArithmeticException("�����÷ο� �߻�. ����� �� ����");
		}
		
		return left + right;
	}

}
