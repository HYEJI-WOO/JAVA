package section2.exam01;

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println("µ¡¼À °è»ê°á°ú : " + calculator.plus(10, 15));
		System.out.println("³ª´°¼À °è»ê°á°ú : " + calculator.divide(20, 6));

		calculator.powerOn();
		
		System.out.println("µ¡¼À °è»ê°á°ú : " + calculator.plus(10, 15));
		System.out.println("³ª´°¼À °è»ê°á°ú : " + calculator.divide(20, 6));
		
		calculator.powerOff();
		
		// private·Î Àá±Å¼­ º¯°æ ºÒ°¡´É
		// calculator.powerState = true;
		
		System.out.println("µ¡¼À °è»ê°á°ú : " + calculator.plus(10, 15));
		System.out.println("³ª´°¼À °è»ê°á°ú : " + calculator.divide(20, 6));
		
		
	}

}

