package lab03;

import java.util.Arrays;

public class Lab3_4 {

    public static void main(String[] args) {

        int[] array1 = {1, 12, 16, 28, 34};
        int[] array2 = {1, 13, 16, 27, 99};
        int[] merge = new int[array1.length + array2.length];

        int arr1Index = 0;
        int arr2Index = 0;
        int mergeIndex = 0;

        while (arr1Index < array1.length && arr2Index < array2.length) {
            if (array1[arr1Index] < array2[arr2Index]) {
                merge[mergeIndex] = array1[arr1Index];
                arr1Index++;
            } else {
                merge[mergeIndex] = array2[arr2Index];
                arr2Index++;
            }
            mergeIndex++;
        }

        while (arr1Index < array1.length) {
            merge[mergeIndex] = array1[arr1Index];
            arr1Index++;
            mergeIndex++;
        }
        while (arr2Index < array2.length) {
            merge[mergeIndex] = array2[arr2Index];
            arr2Index++;
            mergeIndex++;
        }
        System.out.println(Arrays.toString(merge));

    }
}
