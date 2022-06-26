package lab07_1;

public class FTE extends Employee{

    @Override
    public String getTypeStaff() {
        return "FTE";
    }

    @Override
    public int getSalary() {
        return 50000;
    }
}
