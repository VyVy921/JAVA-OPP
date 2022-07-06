package lesson04;

import java.util.Scanner;

public class SwitchCaseLearning {

    public static void main(String[] args) {

        //cho user input 1 con so, moi con so co 1 kqua mong doi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int userInput = scanner.nextInt();

        //co the chuyen khi dieu kien la 1 so duoc input, khong phai 1 range
        if (userInput == 1) {
            System.out.println("giai nhat ");
        } else if (userInput == 2) {
            System.out.println("giai nhi ");
        } else if (userInput == 3) {
            System.out.println("giai ba ");
        } else {
            System.out.println("chuc ban may man ");
        }

        switch (userInput) {
            case 1:
                System.out.println("Giai nhat!");
                break;
            case 2:
                System.out.println("Giai nhi!");
                break;
            case 3:
                System.out.println("Giai ba!");
                break;
            default:
                System.out.println("Chuc may man!!!!" +
                        "");
        }

    }
}
