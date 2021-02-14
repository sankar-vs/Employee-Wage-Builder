public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;

	private final String company;
	private final int empRatePerHr;
        private final int maxHrs;
        private final int workingDays;
	private int totalEmpWage;

	public EmployeeWageBuilder( String company, int empRatePerHr, int maxHrs, int workingDays ) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.maxHrs = maxHrs;
		this.workingDays = workingDays;
	}

	public void calculateEmpWageComp() {
		//Constraints
                int empHrs;
                int Hrs = 0;
                int day = 1;
                int wagePerDay = 0, totalSalary = 0;

                //Computation
                while ( (day <= workingDays) && (Hrs <= maxHrs) ) {
                        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
                        case IS_FULL_TIME:
                                System.out.println("DAY"+day+"# "+"Employee is Present_Full_Time");
                                empHrs = 8;
                                break;
                        case IS_PART_TIME:
                                System.out.println("DAY"+day+"# "+"Employee is Present_Part_Time");
                                empHrs = 4;
                                break;
                        default:
                                System.out.println("DAY"+day+"# "+"Employee is Absent");
                                empHrs = 0;
                        }

                        day += 1;
                        Hrs += empHrs;
                        wagePerDay = empRatePerHr * empHrs;
                        totalSalary += wagePerDay;
                }
		totalEmpWage = totalSalary;
	}

	public String toString() {
		return "Total Emp Wage for Company: " +company+ " is "+ totalEmpWage;
	}
	public static void main(String[] args) {
		//Defining a Oject
		EmployeeWageBuilder dMart = new EmployeeWageBuilder("DMART",20,100,20);
		dMart.calculateEmpWageComp();
		System.out.println(dMart);
		//Defining a Oject
                EmployeeWageBuilder hcl = new EmployeeWageBuilder("HCL",25,90,25);
                hcl.calculateEmpWageComp();
		System.out.println(hcl);

	}
}
