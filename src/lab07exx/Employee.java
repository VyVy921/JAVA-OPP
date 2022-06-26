package lab07;

public class Employee {

    private int salary;
    private int numberStaff;

    private String typeStaff;
    public Employee() {
    }

    public Employee(int salary, int numberStaff, String typeStaff) {
        this.salary = salary;
        this.numberStaff = numberStaff;
        this.typeStaff = typeStaff;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNumberStaff() {
        return numberStaff;
    }

    public void setNumberStaff(int numberStaff) {
        this.numberStaff = numberStaff;
    }

    public String getTypeStaff() {
        return typeStaff;
    }

    public void setTypeStaff(String typeStaff) {
        this.typeStaff = typeStaff;
    }

    public int totalSalary() {
        int total = salary + numberStaff;
        return total;
    }


}
