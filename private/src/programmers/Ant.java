package programmers;

public class Ant {
	public static void main(String[] args) {
		int result = 0;
        
        for(int hp=0; hp<=1000; hp++) {
        	int a = hp/5;
        	int b = hp%5;
        	if(hp>=5 | hp==3) {
        		if(hp%5 == 0) result = a;
        		else result = a + b/3 + b%3;
        		System.out.println("[" + hp + "마리] " +  result);
        	} else {
        		result = hp;
        		System.out.println("[" + hp + "마리] " +  result);
        	}
        }
        
	}

}
