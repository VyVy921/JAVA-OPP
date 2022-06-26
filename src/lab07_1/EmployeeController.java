package lab07_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {

        Employee fte1 = new FTE();
        Employee fte2 = new FTE();
        Employee fte3 = new FTE();
        Employee contractor1 = new Contractor();
        Employee contractor2 = new Contractor();

        new EmployeeController().totalSalary(Arrays.asList(fte1, fte2, fte3, contractor1, contractor2));

    }

    public void totalSalary(List<Employee> employeeList) {
        int numberStaffFTE = 0;
        int numberStaffContractor = 0;
        int fteSalary = 0;
        int contractorSalary = 0;
        int total = 0;

        for (int index = 0; index < employeeList.size(); index++) {
            if (employeeList.get(index).getTypeStaff() == "FTE") {
                numberStaffFTE++;
                fteSalary = numberStaffFTE * employeeList.get(index).getSalary();

            } else numberStaffContractor++;
            contractorSalary = numberStaffContractor * employeeList.get(index).getSalary();
        }
        total = fteSalary + contractorSalary;

        System.out.println("Total Salary " + total);
    }
}
