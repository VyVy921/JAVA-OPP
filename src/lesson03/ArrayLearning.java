package lesson03;

public class ArrayLearning {

    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];

//        myIntArray[0] =1;
//        myIntArray[1] =2;
//        myIntArray[2] =3;
//        myIntArray[3] =4;
//        myIntArray[arrayLength-1] =5;

//        for (int index = 0; index < arrayLength; index++) {
////        }

        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = index +1;
//            myIntArray[index] = index++;

            //c = ++a + b++
            /*
            *  0(new) | 0 | 2  | 0 | 4
             */

        }

        for (int index = 0; index < myIntArray.length; index++) {
            System.out.printf("Element at index %d has value %d\n ",index,myIntArray[index]);
        }

        System.out.println("=======================");
//enhanced for: lay du lieu ra nhung k muon thay doi no. lay tung phan tu trong mang, moi phan tu dai dien cho 1 con so

        for (int number : myIntArray) {
            System.out.println(number);
        }



    }
}
