package lesson03;

public class LoopFlowControlKeyword {

    public static void main(String[] args) {

        for (int index = 0; index < 10; index++) {
            if (index == 3) {
//                break;
                continue;
            }
            System.out.println(index);
        }
    }
}
