package lesson07;

import java.util.Arrays;
import java.util.List;

public class RobotCatController {

    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();
        RobotCat windRobotCat = new WindRobotCat();


new RobotCatController().chargeRobot(Arrays.asList(batteryRobotCat,solarRobotCat,windRobotCat));

    }

    public void chargeRobot(List<RobotCat> robotCatList) {
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }

    }
}
