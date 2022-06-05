package lab04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        int listSize = myList.size();
        listSize = 5;
        for (int index = 0; index < listSize; index++) {
            myList.add(index, getRandomNumber(1000));
        }
// lap lai input
        boolean isContinuing = true;
        while (isContinuing) {
            printMenu();
            int userInput = getUserNumber();

            switch (userInput) {
                case 1:
                    System.out.println("All number: \n");
                    for (int numbers : myList) {
                        System.out.print(numbers + "\t");
                    }

                    break;
                case 2:
                    int max = myList.get(0);
                    for (int index = 0; index < listSize; index++) {
                        if (myList.get(index) >= max) {
                            max = myList.get(index);
                        }
                    }
                    System.out.println("Maximum value: " + max);
                    break;
                case 3:
                    int min = myList.get(0);
                    for (int index = 0; index < listSize; index++) {
                        if (myList.get(index) <= min) {
                            min = myList.get(index);
                        }
                    }
                    System.out.println("Minimum value: " + min);
                    break;
                case 4:
                    System.out.println("Search your number ");
                    int userSearchNumber = getUserNumber();
                    boolean isNumberExisting = false;
                    for (int index = 0; index < listSize; index++) {
                        if (userSearchNumber == myList.get(index)) {
                            System.out.println("Your number " + userSearchNumber + " is existing in arraylist");
                            isNumberExisting = true;
                            break;
                        } else if (userSearchNumber != myList.get(index))
                            continue;
                    }
                    if (!isNumberExisting) {
                        System.out.printf("Your number '%d' is not existing in the list", userSearchNumber);
                    }
                    break;
                default:
                    System.out.println("Please input 1-4!!! ");

                    isContinuing = false;
            }
        }
    }
    private static void printMenu() {
        System.out.println("\n ======Menu====== ");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
    }
    private static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        return scanner.nextInt();
    }
    public static int getRandomNumber(int boundaryNumber) {
        int randomNumber = new SecureRandom().nextInt(boundaryNumber);
        return randomNumber;
    }
}
