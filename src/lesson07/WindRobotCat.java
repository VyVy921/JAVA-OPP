package lesson07;

//Inheritance | sub-class, child class, concrete class
public class WindRobotCat extends RobotCat {

    public String charge(){

        return super.charge().concat("with wind energy!");
    }

}
