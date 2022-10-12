package exam13;

public class AnimalExample {
	
	public static void main(String[] args) {
		// long타입 > int타입
		long longValue = 10;
		int intValue = 10; 
		
		// int타입을 long에 할당 (자동타입변환, 묵시적 형변환)
		long longTemp = intValue;
		
		// long타입을 int에 할당 (강제타입변환, 명시적 형변환)
		int intTemp = (int) longValue;
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// Cat, Dog를 Animal 타입에 할당 (자동타입변환)
		Animal a1 = dog;
		Animal a2 = cat;
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();
		
		// Animal을 Cat, Dog 타입에 할당 (강제타입변환)
		Dog dog2 = (Dog) new Animal();
		Cat cat2 = (Cat) new Animal();
	}
}

class Animal {
	// 슈퍼 클래스 : Animal (크기가 큰 타입)
	// 서브 클래스 : Dog, Cat (크기가 작은 타입)
}

class Dog extends Animal {
	public Dog() {
		System.out.println("강아지 생성");
	}
	
}

class Cat extends Animal {
	public Cat() {
		System.out.println("고양이 생성)");
	}
}
