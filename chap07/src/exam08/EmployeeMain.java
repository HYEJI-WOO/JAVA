package exam08;

import exam08.emp.RegularEmployee;
import exam08.emp.TempEmployee;

public class EmployeeMain {
	public static void main(String[] args) {
//		
//		RegularEmployee remp = new RegularEmployee(1, "ȫ�浿", 3000, 600);
//		TempEmployee temp = new TempEmployee(2, "�ڹμ�", 3000, 2);

		RegularEmployee remp = new RegularEmployee();
		TempEmployee temp = new TempEmployee();
		
		remp.setEmpno(1);
		remp.setName("ȫ�浿");
		remp.setPay(3000);
		remp.setBonus(600);
		System.out.println("������ ȫ�浿 �޿� : " + remp.getPayMonth());
		
		temp.setEmpno(2);
		temp.setName("�ڹμ�");
		temp.setPay(3000);
		temp.setHireyear(2);
		System.out.println("����� �ڹμ� �޿� : " + temp.getPayMonth());
	}

}

/*

 ���(Employee)
 	��� empno
 	�̸� name
 	���� pay
 	
 	���޿� salary (method) : ��ȯŸ�� int
 
 ������(RegularEmployee)
	���ʽ� bonus
	���޿� method : ��ȯŸ�� int
	
 �����(TempEmployee)
 	���Ⱓ hireYear
 	���޿� method : ��ȯŸ�� int
 	
 ���޿� ��� ���
 ������ : (����+���ʽ�)/12
 ����� : ����/12
 
 */