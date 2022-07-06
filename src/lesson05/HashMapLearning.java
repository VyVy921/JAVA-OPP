package lesson05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {

        //Map<Key, Value>
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(new Integer(113), "CSCD");
        emergencyList.put(114, "cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");
//        System.out.println(emergencyList.get(116));

//        emergencyList.put(116, "Sth else");
//        System.out.println(emergencyList.get(116));

        /* Vong lap chay replace
         */
        for (int key : emergencyList.keySet()) {
            if (emergencyList.get(key).equals("Others")) {
                emergencyList.replace(key, "Sonething else");
            }
            System.out.println(emergencyList.get(key));
        }
        /*ConcurrentModificationException: remove trong vong lap
        =>remove thong qua Iterator
        * */

        /* replace value cu thanh moi
         */
//        emergencyList.replace(116, "Others", "Something ");
//        for (int key : emergencyList.keySet()) {
//            System.out.println(emergencyList.get(key));
//        }

//        emergencyList.replace(116, "116");
//        emergencyList.replace(116, "1167", "sth else");
//        emergencyList.remove(116, "116");
//
//        System.out.println(emergencyList.get(113));
//
//        for (int key : emergencyList.keySet()) {
//            System.out.println(emergencyList.get(key));
//        }


    }
}
