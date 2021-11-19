import java.util.Scanner;

public class bt {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int money = scanner.nextInt();
//        int[] keyboard = {40};
//        int[] drives = {5};
//        int result = -1;
//        boolean check = true;
//        for (int i = 0; i < keyboard.length; i++) {
//            for (int j = i; j < drives.length; j++) {
//                if (keyboard[i] + drives[j] < money) {
//                    check = true;
//                    result = keyboard[i] +drives[j];
//                }
//            }
//        }
//        if (check) {
//            System.out.println(result);
//        } else {
//            System.out.println(result);
//        }

    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         b = -1;
        boolean check = true;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = i; j < drives.length; j++) {
                if (keyboards[i] + drives[j] < b) {
                    check = true;
                    b = keyboards [i] +drives[j];
                }
            }
        }
        if (check) {
            return b;
        } else {
            return b;
        }
    }
}
