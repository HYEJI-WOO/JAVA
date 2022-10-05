package ref_type;

public class ReferenceVarExample {
	public static void main(String[] args) {
		
		String refVal1 = "È«±æµ¿"; // ¸®ÅÍ·² ¹æ½Ä 
		String refVal2 = "È«±æµ¿";
		String refVal3 = new String("È«±æµ¿");
		String refVal4 = new String("È«±æµ¿");
		System.out.println(refVal1==refVal2); // true
		System.out.println(refVal1!=refVal2); // false
		System.out.println(refVal2==refVal3); // false
		System.out.println(refVal2!=refVal3); // true
		System.out.println(refVal3==refVal4); // false
		System.out.println(refVal3!=refVal4); // true
		System.out.println(refVal1.equals(refVal4)); // true
		
	}

}
