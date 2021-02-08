public class EmployeeWageBuilder {
	public static void main(String[] args) {
		 //Constraints
                int IS_FULL_TIME = 1;
                int IS_PART_TIME = 2;
		int empRatePerHr = 20;
                int empHrs;
                float wage;
                double empCheck = Math.floor(Math.random() * 10) % 3;
                //Computation
                if (empCheck == IS_FULL_TIME) {
                        System.out.println("Employee is Present_Full_Time");
                        empHrs = 8;
                }
		else if (empCheck == IS_PART_TIME) {
                        System.out.println("Employee is Present_Part_Time");
                        empHrs = 4;
                }
                else {
                        System.out.println("Employee is Absent");
                        empHrs = 0;
                }
                wage = empRatePerHr*empHrs;
                System.out.println("Salary: "+wage);
	}
}
