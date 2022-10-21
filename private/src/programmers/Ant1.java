package programmers;

public class Ant1 {
	public static void main(String[] args) {
		int hp = 3;
		int result = 0;
        int a = hp/5;
        int b = hp%5;
        
        if(hp>=5 | hp==3) {
            if(hp%5 == 0) result = a;
            else result = a + b/3 + b%3;
        } else result = hp;
        
        System.out.println(result);
	}

}
