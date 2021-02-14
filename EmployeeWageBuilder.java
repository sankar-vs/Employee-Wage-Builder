import java.util.LinkedList;
class CompanyEmpWage {
	public final String company;
	public final int empRatePerHr;
	public final int workingDays;
	public final int maxHrs;
	public int totalEmpWage;

	public CompanyEmpWage( String company, int empRatePerHr, int maxHrs, int workingDays ) {
		this.company = company;
                this.empRatePerHr = empRatePerHr;
                this.maxHrs = maxHrs;
                this.workingDays = workingDays;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	public String toString() {
                return "Total Emp Wage for Company: " +company+ " is "+ totalEmpWage;
	}
}
public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;

	public EmployeeWageBuilder() {
		companyEmpWageList = new LinkedList<>();
	}

	private void addCompanyEmpWage(String company, int empRatePerHr, int maxHrs, int workingDays) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHr, maxHrs, workingDays);
		companyEmpWageList.add(companyEmpWage);
	}

	private void calculateEmpWageComp() {
		for (int i = 0; i < numOfCompany ; i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.calculateEmpWageComp(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	private int calculateEmpWageComp(CompanyEmpWage companyEmpWage) {
		//Constraints
                int empHrs;
                int Hrs = 0;
                int day = 1;
                int wagePerDay = 0, totalSalary = 0;

                //Computation
                while ( (day <= companyEmpWage.workingDays) && (Hrs <= companyEmpWage.maxHrs) ) {
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
                        wagePerDay = companyEmpWage.empRatePerHr * empHrs;
                        totalSalary += wagePerDay;
                }
		return totalSalary;
	}

	public static void main(String[] args) {
		//Defining a Oject
		EmployeeWageBuilder empWage = new EmployeeWageBuilder();
		empWage.addCompanyEmpWage("HCL",25,90,25);
                empWage.calculateEmpWageComp();
	}
}
