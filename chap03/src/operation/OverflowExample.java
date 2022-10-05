package operation;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000; // 10^12
		int y = 1000000; 
		int z = x*y;
		System.out.println(z); // 쓰레기값
		
		int x2 = 1000000; // 10^12
		int y2 = 1000000; 
		long z2 = x2*y2;
		System.out.println(z2); // 쓰레기값
		// int*int
		// int(쓰레기값)
		// long = int(할당)
		// long
		
		int x3 = 1000000; // 10^12
		int y3 = 1000000; 
		long z3 = x3*(long)y3;
		System.out.println(z3);
		// int*(long)int
		// int*long
		// long*long
		// long
		
		
		
	}
}
