package lab07_1;

public class Contractor extends Employee{
    @Override
    public String getTypeStaff() {
        return "Contractor";
    }

    @Override
    public int getSalary() {
        return 40000;
    }

}
