package operation;

public class DenyLogicOperationExample1 {
	public static void main(String[] args) {
		
		int value = 10;
		if(!(value > 20)) {
			System.out.println("value���� 20���� ũ�� �ʴ�.");
		}
		// i(10>20)
		// !(false)
		// true
		
		System.out.println(20>10); // 20�� 10���� ũ��. true
		System.out.println(20>=10); // 20�� 10���� ũ�ų� ����. true
			// 20�� 10���� ���� �ʴ�.
		
		System.out.println(20<10); // 20�� 10���� �۴�. false
		System.out.println(20<=10); // 20�� 10���� �۰ų� ����. false
			// 20�� 10���� ũ�� �ʴ�.
		          
		System.out.println(20==10); // 20�� 10�� ����. false
		System.out.println(20!=10); // 20�� 10�� �ٸ���. true
	}

}
