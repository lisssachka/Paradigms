package homework2;

import java.util.Scanner;

public class MultyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");

        int num2 = sc.nextInt();
        table(num2);
    }

    public static void table(int num) {
        int num1 = 1;
        while (num1 <= num) {
            for (int i = 0; i < 10; i++) {
                System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
            }
            num1++;
            System.out.println();
        }
    }


}

