package lesson04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        //ArrayList implements interface List
//raw type : => phai dinh nghia, chi dinh type
// <> chi chap nhan wraptype
//        ArrayList<Integer> myList = new ArrayList<>();
//        List<Integer> myList = new ArrayList<>();
        List<Integer> myList = new ArrayList<>();

        //tao 1 list giong array, nhung ko them,sua,xoa gia tri duoc
        List<Integer> myList2 = Arrays.asList(1,2,3);

        myList.add(1);
        myList.add(2);
        myList.add(0,3);

        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }

        for (int number : myList) {
            System.out.println("=========");
            System.out.println(number);
        }

    }
}