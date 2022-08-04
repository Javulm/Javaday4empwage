package empwage;
public class EmpwageComputation {
public static void main(String[] args) {
	System.out.println("Welcome employee wage computation");

    int present = 1;
    
    int absent = 3;
    
    int part_time_present = 2;
    
    int wage_per_hr = 20;
    
    int part_time_hr = 4;
    
    int full_day_hr = 8;

    int empwage=0;
    
    int max_working_days = 20;
    
	int working_hrs =0;
	int working_days=0;
	int max_working_hrs = 100;
	int totalwage=0;
	
    while(working_hrs < max_working_hrs && working_days < max_working_days)
    {
   double check= Math.floor(Math.random() *10) % 3;
  
    switch ((int)check)
    {
   	case 1:
   		System.out.println("Employee is present.");
	    empwage = wage_per_hr * full_day_hr;
	    working_hrs += full_day_hr;
	    break;
   	case 2:
   		System.out.println("Employee is present for part time.");
		empwage = wage_per_hr * part_time_hr;
		 working_hrs += part_time_hr;
		 break;
   	default:
   		System.out.println("Employee is absent.");
   	}
    totalwage += empwage;
    System.out.println("employee for day-" + working_days + "=> " + empwage);
    working_days++;
}
    	System.out.println("total wage = " + totalwage);
	   
    	System.out.println("total working hours = " + working_hrs);
}
}
