package exam05;

public class PhoneMain {
	public static void main(String[] args) {
		Phone p1 = new Phone(); 
		Phone p2 = new SmartPhone(); 
		SmartPhone p3 = new SmartPhone(); 
		checkType(p1); // true
		checkType(p2); // true 
		checkType(p3); // true
	}
	
	public static void checkType(Phone obj) {
		if(obj instanceof Phone) {
			System.out.println("Phone 타입");
		} else {
			System.out.println("Phone 타입이 아님");
		}
	}

}

class Phone{} // 상위타입
class SmartPhone extends Phone{} // 하위타입
