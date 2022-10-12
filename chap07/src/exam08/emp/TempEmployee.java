package exam08.emp;

public class TempEmployee extends Employee {
	
	private int hireyear;
	
//	public TempEmployee(int empno, String name, int pay, int hireyear) {
//		super(empno, name, pay);
//		this.hireyear = hireyear;
//	}
	
	@Override
	public int getPayMonth() {
		return this.pay / 12;
	}

	public void setHireyear(int hireyear) {
		this.hireyear = hireyear;
	}

}
