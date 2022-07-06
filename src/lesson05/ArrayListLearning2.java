package lesson05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning2 {

    public static void main(String[] args) {

        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);

        int listSize = myArrList.size();

        for (int index = 0; index < listSize; index++) {
            int currentNumber = myArrList.get(index);
            if (currentNumber % 2 != 0) {
                myArrList.set(index, currentNumber + 1);
            }
        }
        System.out.println(myArrList);


        for (int index = 0; index < listSize; index++) {
            int currentNumber = myArrList.get(index);
            if (currentNumber == 4) {
                myArrList.remove(new Integer(4));
                listSize--;
                index--;
            }
        }

        System.out.println(myArrList);

        //dot notation
        /*
        * isEmpty: true/false
        * contains: co chua gia tri ko, tra ve true/false
        * */
        System.out.println(myArrList.isEmpty());
        System.out.println(myArrList.contains(100));
        System.out.println(myArrList.contains(2));
        System.out.println(myArrList.indexOf(2));
    }
}
