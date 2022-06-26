package lab07;

public class EmployeeController {

    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractor = new Contractor();

        EmployeeController employeeController = new EmployeeController();

        System.out.println(contractor.totalSalary());
        System.out.println(contractor.getSalary());
        System.out.println(contractor.getNumberStaff());
        System.out.println(fte.totalSalary());

    }




}
