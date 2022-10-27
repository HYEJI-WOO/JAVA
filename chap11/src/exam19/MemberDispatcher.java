package exam19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MemberDispatcher {
	// ���� : ����ڷκ��� ��û�� �޾� ���޹��� ��û�� ��Ʈ�ѷ��� ����
	
	MemberController controller = new MemberController();

	public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Scanner scan = new Scanner(System.in);
		System.out.println("���α׷� ����");
		while(true) {
			System.out.print(">>�޴�����");
			String command = scan.nextLine();
			
			if(command.equals("0")) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
			// MemberController�� ����� �޼ҵ� ������ Method[]Ÿ������ �޾ƿ�
			Method[] methods = 
					controller.getClass().getDeclaredMethods();
			
			Method findMethod = null;
			for(Method method : methods) {
				// �޼ҵ忡 ����� RequestMapping Ÿ���� ������̼�
				RequestMapping requestMapping 
					= method.getDeclaredAnnotation(RequestMapping.class);
				if(requestMapping != null) {
					String value = requestMapping.command();
					if(command.equals(value)) {
						findMethod = method;
					}
				}
				if(findMethod!=null) {
					findMethod.invoke(controller);
				}
			}
			
		} // while end
		
	} // run end

}