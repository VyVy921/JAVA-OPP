package lab03;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Lab3_3 {
    public static void main(String[] args) {

        int[] myArray = {7, 2, 9, 1};

//        for (int value : myArray) {
//            System.out.println(value);
//        }
        for (int unsortedIndex = myArray.length-1; unsortedIndex > 0; unsortedIndex--) {
            for (int index = 0; index < unsortedIndex; index++) {
                if (myArray[index] > myArray[index+1]) {
                    int tem = myArray[index];
                    myArray[index] = myArray[index+1];
                    myArray[index+1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));

    }
}

