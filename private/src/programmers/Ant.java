package programmers;

public class Ant {
	public static void main(String[] args) {
		int hp = 33;
		int result;
		int n;
		
		if(hp<5) result = hp;
		else if(hp%5 == 0) result = hp/5;
		else if(hp/3 == 0) result = hp/5 + (hp%5)/3;
		else result = hp/5 + (hp%5)/3 + ((hp%5)/3)%3;
		
		System.out.println(result);
	}

}
