package Snacks3;

import java.util.Scanner;

public class CountOfPosNegAndZeroInts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int positiveInt = 0;
        int negativeInt = 0;
        int zero = 0;
        while(num != -1){
            System.out.println("Enter a number and -1 to discontinue");
            num = input.nextInt();
            if (num > 0) positiveInt++;
            else if (num < 0) negativeInt++;
            else zero++;
        }
        System.out.printf("Number of positive numbers are %d%n", positiveInt);
        System.out.printf("Number of negative numbers are %d%n", negativeInt);
        System.out.printf("Number of of zeroes are %d%n", zero);
    }
}
