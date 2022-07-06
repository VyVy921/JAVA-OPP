package lesson04;

import java.security.SecureRandom;

public class FunctionLearning {

    public static void main(String[] args) {

        /*maintenance: cao
         * Extendable: thap
         * Reliable:
         * */
        //DRY: dont repeat yourself ==> function tao ra de goi ten

        sayHello("Teo", 10); //argument
        sayHello("ti", 20);
        sayHello("Tun",7);

        System.out.println(getRandomNumber(10));
        System.out.println(getRandomNumber(100));

    }

//method phai co Access modifier: public
// class method: static
// Kieu tra ve co hoac k: void (ko)
// parameter() : chi dinh kieu du lieu

    public static void sayHello(String name, int age) {
        //chua logic
        System.out.println("Hello !!!" + name + age);
    }

    public static int getRandomNumber(int boundaryNumber){
        int randomNumber = new SecureRandom().nextInt(boundaryNumber);
        return randomNumber;
    }

}
