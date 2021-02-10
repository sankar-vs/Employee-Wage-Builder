public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int empRatePerHr = 20;
        public static final int maxHrs = 100;
        public static final int workingDays = 20;

	public static void main(String[] args) {
		//Constraints
                int empHrs;
		int Hrs = 0;
		int day = 1;
                float wagePerDay = 0, totalSalary = 0;
                //Computation
		while ( (day <= workingDays) && (Hrs < maxHrs) ) {
                        double empCheck = Math.floor(Math.random() * 10) % 3;
	                switch((int)empCheck) {
		                case IS_FULL_TIME:
	        	                System.out.println("Employee is Present_Full_Time");
                        	        empHrs = 8;
	                                break;
        	                case IS_PART_TIME:
                	                System.out.println("Employee is Present_Part_Time");
                        	        empHrs = 4;
                                	break;
                       		default:
                                	System.out.println("Employee is Absent");
                             		empHrs = 0;
			}
			day += 1;
                        Hrs += empHrs;
                	wagePerDay = empRatePerHr * empHrs;
			totalSalary += wagePerDay;
		}
                System.out.println("Salary: "+ totalSalary);
	}
}
