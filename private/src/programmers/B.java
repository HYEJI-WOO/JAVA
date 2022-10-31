package programmers;

public class B {
	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int result = 0;
		
		for(int i=0; i<before.length(); i++) {
			for(int j=0; j<after.length(); j++) {
				if(before.charAt(i)==after.charAt(j)) {
					result ++;
				}
			}
		}
		System.out.println(result);
		

	}
}
