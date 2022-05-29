package lab02;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lease input your weight (kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Lease input your height (m): ");
        float height = scanner.nextFloat();
        float BMI = weight / (height * 2.0F);
        System.out.println("Your BMI is: " + BMI);
        double weightNormal01 = 18.5 * (double)height * 2.0;
        double weightNormal02 = 24.9 * (double)height * 2.0;
        if ((double)BMI < 18.5) {
            System.out.printf("Underweight!!! You need to increase %f kg", weightNormal01 - (double)weight);
        } else if ((double)BMI <= 24.9) {
            System.out.println("Perfect !!! Keep your body");
        } else if ((double)BMI <= 29.9) {
            System.out.printf("Overweight!!! You need to decrease %f kg", (double)weight - weightNormal02);
        } else {
            System.out.printf("Obesity!!! You need to decrease %f kg", (double)weight - weightNormal02);
        }

    }
}
