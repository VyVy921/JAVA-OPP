package lab07_1;

public class Employee {
    private String typeStaff;
    private int salary;

    public Employee() {
    }

    public Employee(String typeStaff, int salary) {
        this.typeStaff = typeStaff;
        this.salary = salary;
    }

    public String getTypeStaff() {
        return typeStaff;
    }

    public int getSalary() {
        return salary;
    }



}
