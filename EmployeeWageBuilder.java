public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int empRatePerHr = 20;
	public static void main(String[] args) {
		 //Constraints
                int empHrs;
                float wage;
                double empCheck = Math.floor(Math.random() * 10) % 2;
                //Computation
                if (empCheck == IS_FULL_TIME) {
                        System.out.println("Employee is Present");
                        empHrs = 8;
                }
                else {
                        System.out.println("Employee is Absent");
                        empHrs = 0;
                }
                wage = empRatePerHr * empHrs;
                System.out.println("Salary: "+wage);
	}
}
