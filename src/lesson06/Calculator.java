package lesson06;

public class Calculator {
/* Method signature: method name, parameter(so luong, loai)
*  Method overloading: method name giong nhau, thay doi parameter(khac so luong hoac khac type)
   xuat hien o thoi diem Compile Time
   ko thay doi access modifier, return type
*   Method overriding: inheritance, xuat hien o Run time
 * */
    public int sum(int a, int b) {

        return a + b;
    }
    // Varagrs | Rest Parameters: dung khi ko biet co bao nhieu parameter
    public int sum(int... numbers) {
        int arrayTotal = 0;
        for (int number : numbers) {
            arrayTotal = arrayTotal + number;
        }
        return arrayTotal;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1,2));
        System.out.println(calculator.sum(1,2,5));
        System.out.println(calculator.sum(1,2,5,6,7));
    }

}
