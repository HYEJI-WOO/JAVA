package exam11.main;

import exam11.modifier.Sport;

public class SportMain {
	public static void main(String[] args) {
		Sport sports = new Sport();
		sports.new BaseBall(); // public
//		sports.new BasketBall(); // protected
//		sports.new FootBall(); // default
//		sports.new VolleyBall(); // private
	}

}
