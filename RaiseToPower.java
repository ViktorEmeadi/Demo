package Snacks3;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();

        System.out.println("Enter another number");
        int num2 = input.nextInt();
        int num1Pow = 0;
        int num2Pow = 0;

        for (int count = 1; count <= num2; count++){
            num1Pow = num1 * count;
        }
        for (int count = 1; count <= num1; count++){
            num2Pow = num1 * count;
        }
        System.out.printf("%d raised to power %d is %d%n",num2,num1, num1Pow);
        System.out.printf("%d raised to power %d is %d%n", num1,num2,num2Pow);
    }
}
