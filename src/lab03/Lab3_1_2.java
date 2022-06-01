package lab03;

public class Lab3_1_2 {

    public static void main(String[] args) {

        int even = 0;
        int odd = 0;
        int lengthArray = 5;
        int[] myIntArray = new int[lengthArray];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;

        for (int index = 0; index < myIntArray.length; index++) {
            if (myIntArray[index] % 2 == 0) {
                even++;
            } else odd++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        int max = myIntArray[0];
        for (int index = 0; index < myIntArray.length; index++) {
            if (myIntArray[index] > max) {
                max = myIntArray[index];
            }
        }
        System.out.println("Max number is: " + max);

        int min = myIntArray[0];
        for (int index = 0; index < myIntArray.length; index++) {
            if (myIntArray[index] < min) {
                min = myIntArray[index];
            }
        }
        System.out.println("Min number is: " + min);

    }
}
