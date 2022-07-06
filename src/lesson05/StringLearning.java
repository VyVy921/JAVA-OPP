package lesson05;

import java.util.Arrays;

public class StringLearning {

    public static void main(String[] args) {
        //Literal declaration
        String myName1 = "Teo";
        String myName2 = "Teo";

        //String Object
        String myName3 = new String("Teo");
        System.out.println("myname1 == myname 2: " + (myName1.equals(myName2)));
        System.out.println("myname1 == myname 3: " + (myName1.equals(myName3)));

        String myPW = "123myPassword";
        /* xet tung ki tu
         * chu so: +1
         * chu thuong: +1
         * chu hoa: +1
         * loop: a && b && c > 0
         * true
         * else: false incorrect
         * ==> chuyen pw sang array of character
         * */
        char[] myChar = myPW.toCharArray();
        int totalDigits = 0;
        int totalLowerCase = 0;
        int totalUpperCase = 0;
        for (char character : myChar) {
            if (Character.isDigit(character))
                totalDigits++;

            if (Character.isLowerCase(character))
                totalLowerCase++;

            if (Character.isUpperCase(character))
                totalUpperCase++;

        }
        if (totalDigits > 0 && totalLowerCase > 0 && totalUpperCase > 0) {
            System.out.println("Your pw correct");
        } else System.out.println("pw incorrect");

        // Immutable, khong thay doi dc gia tri
        String badWordContainer = "   bad, very bad, something else    ";
        String newWord = badWordContainer.replace("bad", "b**");
        System.out.println(newWord);

        //trim
        String trimString = badWordContainer.trim();
        System.out.println("Trim of String: " + trimString);

        // subString, indexOf, spLit
        String url = "http://google.com";
        String cutUrlBegin = url.substring(7);
        System.out.println("substring Begin " + cutUrlBegin);
        String cutUrlBeginEnd = url.substring(7, 13);
        System.out.println("substring Begin End " + cutUrlBeginEnd);

        System.out.println(url.indexOf("o"));
        System.out.println(url.contains("https"));

        String[] spListStr = url.split("");
        System.out.println(Arrays.toString(spListStr));

        // $10 10,000vnd
        //RegularExpression | Regex: loai bo theo quy luat
        String cookingTimeStr = "105mins";
        String cookingTimeNum = cookingTimeStr.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNum);

// Pattern, Matcher

        // Concat | Concatenation
        String s1 = "Hello ";
        String s2 = "Teo ";
        System.out.println(s1.concat(s2).concat(" !!!"));

        // StringBuilder


    }
}
