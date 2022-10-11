package information;

public class MockExam2308 {
	public static void main(String[] args) {
		int[] a = new int[8];
		int sum = 100;
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
		}
		for(int i=0; i<a.length; i++) {
			if(i%3==1) {
				sum -= a[i];
			}
		}
		System.out.println(sum);
	}

}
