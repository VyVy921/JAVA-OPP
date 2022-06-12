package lab06;

public class Lab06_1 {

    public static void main(String[] args) {

        String stringInput = new String();
        stringInput = "2hrs and 5 minutes";
        String stringContainHrs = stringInput.substring(0, 1);
        String stringContainMinute = stringInput.substring(9, 10);
        System.out.println(stringContainHrs);
        System.out.println(stringContainMinute);

        int HrsNumber = Integer.valueOf(stringContainHrs);
        int MinuteNumber = Integer.valueOf(stringContainMinute);
        int total;
        total = HrsNumber * 60 + MinuteNumber;
        System.out.println("minutes in total: " + total);

    }

}
