package lesson06;

public class TestRobotCat {

    public static void main(String[] args) {
//        RobotCat meo = new RobotCat();
        RobotCat kitty = new RobotCat("Kitty");
        kitty.greeting();
        kitty.setName("Meo Meo");
        kitty.greeting();
    }
}
