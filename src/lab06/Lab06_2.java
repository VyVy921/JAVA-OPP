package lab06;

import java.util.Scanner;

public class Lab06_2 {

    public static void main(String[] args) {
        String myPassword = new String();
        myPassword = "password123";
        int userInputNumber = 0;

        while (userInputNumber < 3) {
            if (!getUserPassword().equals(myPassword)) userInputNumber++;
        }
        System.out.println("You have been entered over 3 times");
    }

    private static String getUserPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password ");
        return scanner.nextLine();
    }
}
