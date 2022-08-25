package day3practiceproblems;

public class DailyEmployeeWage {

	public static void main(String[] args) {
		
		int isPresent=1;
		double empCheck =  Math.floor(Math.random()  *10) % 2  ; 
		
		System.out.println(empCheck);
		
		if (empCheck==isPresent)
		{
			int empRatePerHr=20;
			int empHrs=8;
			int salary= empRatePerHr*empHrs;
			System.out.println("Daily employee wage is =  " + salary);
		}
		
		else
		{
			int salary=0;
			System.out.println("Daily employee wage is =  " + salary);
			
			
		}
		
		
		
	}
	
}
