package section2.exam06;

public class Television {

//	String company = "»ï¼º";
//	String model = "LCD";
//	String info = company + "_" + model;
	
	String company;
	String model;
	String info;
	
	public Television() {
		company = "»ï¼º";
		model = "LCD";
		info = company + "_" + model;
				
	}
	
	public static void main(String[] args) {
		Television tv = new Television();
		System.out.println(tv.company);
		System.out.println(tv.model);
		System.out.println(tv.info);
		
	}

}