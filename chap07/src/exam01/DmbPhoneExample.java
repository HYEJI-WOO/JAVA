package exam01;

public class DmbPhoneExample {
	public static void main(String[] args) {
		
		// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		// DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		// CellPhone���� ���� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receivevoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUP();
		
		// DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
