package lesson03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {
        boolean isContinuing = true;
//ko dc xai 1 minh, vi se vao infinitive loop

//is sth still true then do something
        while (isContinuing) {
            System.out.println("====game menu==");
            System.out.println("1. Genarate a random number less than 1000");
            System.out.println("0. exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select option: ");
            int option = scanner.nextInt();
            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                System.out.println("Your random number is: " + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("nhap lui roiii !!!");
            }
        }
        System.out.println("see you again");


        //Scanner scanner lay 1 con so ben ngoai
        // new Scanner lay tu ban phim chuan(System.in)
        //moi user nhap 1 con so
        // lay con so tu user

    }
}
