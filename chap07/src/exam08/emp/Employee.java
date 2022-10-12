package exam08.emp;

public class Employee {
	
	protected int empno;
	protected String name;
	protected int pay;

//	public Employee(int empno, String name, int pay) {
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
//	};
	
	
	// 월급여(메소드) : 반환타입 int
	public int getPayMonth() {
		return 200;
		}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
}

