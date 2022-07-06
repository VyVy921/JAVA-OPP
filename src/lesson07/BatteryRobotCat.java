package lesson07;

//Inheritance | sub-class, child class, concrete class
public class BatteryRobotCat extends RobotCat {

    @Override
    public String charge() {
        return super.charge().concat("with battery");
    }
}
