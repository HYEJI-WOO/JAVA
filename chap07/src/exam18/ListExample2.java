package exam18;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
	public static void main(String[] args) {
		List<Contact> contactList = new ArrayList<>();
		Contact contact1 = new Contact("±èÃ¶¼ö", "01011112222");
		Contact contact2 = new Contact("¹Ú¿µÈñ", "01011112222");
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(new Contact("±è¹Î¼ö", "01025454645"));
		
		System.out.println(contactList);
		
	}

}
