package day3practiceproblems;

public class SolveusingswitchcaseUC4 {

	
	static int salary=0;
	static int empRatePerHr=0;
	static int empHrs=0;

	static final byte isPartTime=1;
	static final byte isFulltime=2;
	
	public static void main(String[] args) {
		
		
		int partOrFulltime =  (int)Math.floor(Math.random()  *3);
		System.out.println(partOrFulltime);
		
		
		switch (partOrFulltime) {
		
			case isFulltime:
				empRatePerHr=20;
				empHrs=10;
				salary= empRatePerHr*empHrs;
				System.out.println("Daily employee wage is =  " + salary);
				break;
				
			case isPartTime:
				int empRatePerHr=20;
				int empHrs=8;
				int salary= empRatePerHr*empHrs;
				System.out.println("Daily employee wage is =  " + salary);
				break;
		    
		    case 0:
		    	salary=0;
				System.out.println("Daily employee wage is =  " + salary);
				break;
		        
		    default:
		    	System.out.println("NO EMPLOYEE DATA");
		   
			}
	
	
	
	}
	
	
	
	
}
