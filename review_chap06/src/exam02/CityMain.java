package exam02;

public class CityMain {
	public static void main(String[] args) {
		// ������
		City seoul = new City("����", 1000000, false);
		City roma = new City("�θ�", 320000, true);
		City busan = new City("�λ�", 500000, false);
		
//		System.out.println(seoul.toString());
//		System.out.println(roma);
		seoul.setTax();
		System.out.println("���� : " + seoul.getTax());
		busan.setTax();
		System.out.println("�λ� : " + busan.getTax());
		
		// ����(������)
		roma.setOwnedBuilding(CityBuilding.VILLA);
		roma.setTax();
		System.out.println("�θ� - ���� : " + roma.getTax());
		
		roma.setOwnedBuilding(CityBuilding.HOTEL);
		roma.setTax();
		System.out.println("�θ� - ȣ�� : " + roma.getTax());
		
		roma.setOwnedBuilding(CityBuilding.BUILDING);
		roma.setTax();
		System.out.println("�θ� - ���� : " + roma.getTax());
	}

}
