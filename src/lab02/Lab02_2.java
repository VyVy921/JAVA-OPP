package lab02;

import java.util.Scanner;

public class Lab02_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.printf("%d is an even number", number);
        } else {
            System.out.printf("%d is an odd number", number);
        }

    }
}
