package lesson04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhiteLoop {

    public static void main(String[] args) {

        //infinitive loop
        boolean isStillTrue = false;
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(11);
        System.out.println("Random number " + randomNumber);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input the number: ");
            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Hoorayy!!!");
                break;
            }
//    System.out.println("Playing game....");
            guessingTime++;
        } while (guessingTime < 3);

        System.out.println("See you again");
    }
}
