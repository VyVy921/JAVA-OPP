package lesson04;

public class ArrayPostFixPrefix {

    public static void main(String[] args) {
int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
         myIntArray[index] = index + 1;
        }

        for (int value : myIntArray) {
            System.out.println(value);
        }

    }
}
