package programmers;

public class Test2 {
	
	// Á¦°ö¼ö ÆÇº°ÇÏ±â
	
//	class Solution {
//	    public int solution(int n) {
//	        int answer = 0;
//	        for(int i=1; i<=n; i++) {
//	            if(n%i == 0) answer += 1;
//	        }
//	        
//	        if(answer % 2 == 0) return 2;
//	        else return 1;
	
	public static void main(String[] args) {
		int test1 = 144;
		int test2 = 170;
		
//		int num1 = (int) Math.sqrt(test1);
//		System.out.println(num1); // 12
//		
//		double num2 = Math.sqrt(test2);
//		System.out.println(num2);
		
		int root = (int) Math.sqrt(test1); // 12
		if(root * root == test1) {
			System.out.println("Á¦°ö¼ö");
		} System.out.println("Á¦°ö¼ö¾Æ´Ô");
	
	    
	}

}
