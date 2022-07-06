package lesson07;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();

        batteryRobotCat.setName("Kitty");
        batteryRobotCat.setProductionDate("06/08/2022");

        solarRobotCat.setName("SolarRobotCat");
        solarRobotCat.setProductionDate("06/08/2022");

        System.out.println(batteryRobotCat);
        System.out.println(solarRobotCat);

        System.out.println(batteryRobotCat.charge());
        System.out.println(solarRobotCat.charge());
    }
}
