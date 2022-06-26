package lab07;

public class Contractor extends Employee {
//
//    @Override
//    public int getSalary() {
//        return 40000;
//    }
//
//    @Override
//    public int getNumberStaff() {
//        return 2;
//    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(4000);
    }

    @Override
    public void setNumberStaff(int numberStaff) {
        super.setNumberStaff(2);
    }
}
