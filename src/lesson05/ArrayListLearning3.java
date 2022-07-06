package lesson05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListLearning3 {

    public static void main(String[] args) {

        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(4);
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(4);
        myArrList.add(4);

//newArrayList if myArrayList >< newArrayList, newArrayList = myArrayList
        List<Integer> withoutDupValue = new ArrayList<>();
        for (int value : myArrList) {
            if (!withoutDupValue.contains(value)) {
                withoutDupValue.add(value);
            }
        }

        System.out.println(myArrList);
        System.out.println(withoutDupValue);

        Set<Integer> set = new HashSet<>(myArrList);
        System.out.println(set);

        List<Integer> arrayListWithSet = new ArrayList<>(set);
        System.out.println(arrayListWithSet);

        //index=3: Exclusive
        List<Integer> first3MinValues = arrayListWithSet.subList(0,3);

    }
}
