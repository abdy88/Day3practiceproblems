package day3practiceproblems;

public class AddparttimeemployeeandwageUC3 {
	static short salary=0;
	
	public static void main(String[] args) {
		
		byte isPresent=1;
		byte isPartTime=2;
		byte isFulltime=3;
		
		double empCheck = Math.floor(Math.random()  *10) % 2  ; 
		
		double partOrFulltime =  Math.floor(Math.random()  *4);
		
		System.out.println(empCheck);
		System.out.println(partOrFulltime);
		
		
		if (empCheck==isPresent && partOrFulltime==isFulltime)
		{	
			int empRatePerHr=20;
			int empHrs=10;
			int salary= empRatePerHr*empHrs;
			System.out.println("Daily employee wage is =  " + salary);
		}
		
		else if (empCheck==isPresent && partOrFulltime==isPartTime)
		{
			
			int empRatePerHr=20;
			int empHrs=8;
			int salary= empRatePerHr*empHrs;
			System.out.println("Daily employee wage is =  " + salary);
			
		}
		
		else {
			salary=0;
			System.out.println("Daily employee wage is =  " + salary);
		
			
		}
		
	}

}
