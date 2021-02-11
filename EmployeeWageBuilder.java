public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;

	private final String company;
	private final int empRatePerHr;
        private final int maxHrs;
        private final int workingDays;

	public EmployeeWageBuilder( String company, int empRatePerHr, int maxHrs, int workingDays ) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.maxHrs = maxHrs;
		this.workingDays = workingDays;
	}

	public static int workHrs(int check) {
		int workingHours;
		switch(check) {
                	case IS_FULL_TIME:
                        	System.out.println("Employee is Present_Full_Time");
                                workingHours = 8;
                                break;
                        case IS_PART_TIME:
                                System.out.println("Employee is Present_Part_Time");
                                workingHours = 4;
                                break;
                        default:
                                System.out.println("Employee is Absent");
                                workingHours = 0;
                        }
		return workingHours;

	}
	public static void main(String[] args) {
		//Defining a Oject
		EmployeeWageBuilder dMart = new EmployeeWageBuilder("DMART",20,100,20);
		//Constraints
                int empHrs;
		int Hrs = 0;
		int day = 1;
                float wagePerDay = 0, totalSalary = 0;

		//Computation
		while ( (day <= dMart.workingDays) && (Hrs < dMart.maxHrs) ) {
                        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
	                empHrs = workHrs(empCheck);
	                day += 1;
                        Hrs += empHrs;
                	wagePerDay = dMart.empRatePerHr * empHrs;
			totalSalary += wagePerDay;
		}
                System.out.println("Company: " + dMart.company + " Total Salary: "+ totalSalary);
	}
}
