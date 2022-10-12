package exam13;

public class AnimalExample {
	
	public static void main(String[] args) {
		// longŸ�� > intŸ��
		long longValue = 10;
		int intValue = 10; 
		
		// intŸ���� long�� �Ҵ� (�ڵ�Ÿ�Ժ�ȯ, ������ ����ȯ)
		long longTemp = intValue;
		
		// longŸ���� int�� �Ҵ� (����Ÿ�Ժ�ȯ, ����� ����ȯ)
		int intTemp = (int) longValue;
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// Cat, Dog�� Animal Ÿ�Կ� �Ҵ� (�ڵ�Ÿ�Ժ�ȯ)
		Animal a1 = dog;
		Animal a2 = cat;
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();
		
		// Animal�� Cat, Dog Ÿ�Կ� �Ҵ� (����Ÿ�Ժ�ȯ)
		Dog dog2 = (Dog) new Animal();
		Cat cat2 = (Cat) new Animal();
	}
}

class Animal {
	// ���� Ŭ���� : Animal (ũ�Ⱑ ū Ÿ��)
	// ���� Ŭ���� : Dog, Cat (ũ�Ⱑ ���� Ÿ��)
}

class Dog extends Animal {
	public Dog() {
		System.out.println("������ ����");
	}
	
}

class Cat extends Animal {
	public Cat() {
		System.out.println("����� ����)");
	}
}
