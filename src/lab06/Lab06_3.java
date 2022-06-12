package lab06;

import java.util.ArrayList;
import java.util.List;

public class Lab06_3 {
    public static void main(String[] args) {
        String myStr = new String();
        myStr = "100 minutes ";
        char[] myChar = myStr.toCharArray();
        int charLength = 0;
//        char[] charContainNumber = new char[charLength];
        List<Character> listChar = new ArrayList<>();
        char charNumber;
        int index = 0;
        for (char character : myChar) {
            if (Character.isDigit(character)) {
                charNumber = myChar[index];
                listChar.add(charNumber);
                index++;
                System.out.println(charNumber);
            } else index++;
        }

        System.out.println("Number is " + listChar);

    }
}
