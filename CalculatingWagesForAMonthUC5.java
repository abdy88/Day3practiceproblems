package day3practiceproblems;

public class CalculatingWagesForAMonthUC5 {
	

	static int salary=0;
	static int totalSalary=0;
	static int empRatePerHr=0;
	static int empHrs=0;

	static final byte isPartTime=1;
	static final byte isFulltime=2;
	
	public static void main(String[] args) {
		
		
		

		for (int day=1; day<=20; day++) 
			{
			int partOrFulltime =  (int)Math.floor(Math.random()  *3);
			System.out.println(partOrFulltime);
			
				switch (partOrFulltime) 
					{
		
						case isFulltime:
						empRatePerHr=20;
						empHrs=10;
						break;
				
				
						case isPartTime:
						empRatePerHr=20;
						empHrs=8;
						break;
						
		    
						case 0:
						empHrs=0;
						break;
		        
						default:
						System.out.println("NO EMPLOYEE DATA");
		   
			}
			
				salary=empHrs*empRatePerHr;
				System.out.println("salary is = " + salary);
				totalSalary=totalSalary+salary;
				System.out.println("accumulated salary till now  is = " + totalSalary);
		}
				
				System.out.println("End of month final total salary is = " + totalSalary);
		
	}
	
	
	
	
}
