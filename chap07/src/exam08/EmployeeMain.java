package exam08;

import exam08.emp.RegularEmployee;
import exam08.emp.TempEmployee;

public class EmployeeMain {
	public static void main(String[] args) {
//		
//		RegularEmployee remp = new RegularEmployee(1, "홍길동", 3000, 600);
//		TempEmployee temp = new TempEmployee(2, "박민수", 3000, 2);

		RegularEmployee remp = new RegularEmployee();
		TempEmployee temp = new TempEmployee();
		
		remp.setEmpno(1);
		remp.setName("홍길동");
		remp.setPay(3000);
		remp.setBonus(600);
		System.out.println("정규직 홍길동 급여 : " + remp.getPayMonth());
		
		temp.setEmpno(2);
		temp.setName("박민수");
		temp.setPay(3000);
		temp.setHireyear(2);
		System.out.println("계약직 박민수 급여 : " + temp.getPayMonth());
	}

}

/*

 사원(Employee)
 	사번 empno
 	이름 name
 	연봉 pay
 	
 	월급여 salary (method) : 반환타입 int
 
 정규직(RegularEmployee)
	보너스 bonus
	월급여 method : 반환타입 int
	
 계약직(TempEmployee)
 	고용기간 hireYear
 	월급여 method : 반환타입 int
 	
 월급여 계산 방법
 정규직 : (연봉+보너스)/12
 계약직 : 연봉/12
 
 */