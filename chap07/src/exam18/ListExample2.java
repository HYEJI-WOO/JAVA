package exam18;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
	public static void main(String[] args) {
		List<Contact> contactList = new ArrayList<>();
		Contact contact1 = new Contact("��ö��", "01011112222");
		Contact contact2 = new Contact("�ڿ���", "01011112222");
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(new Contact("��μ�", "01025454645"));
		
		System.out.println(contactList);
		
	}

}
