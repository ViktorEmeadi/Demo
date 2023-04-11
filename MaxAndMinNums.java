package Snacks3;
import java.util.Scanner;
public class MaxAndMinNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numm = 3;
        int num = 3;
        int max = 0;
        int min = 1;
        while (num != 101 || numm != 101){
            System.out.println("Enter a number or enter 101 to terminate");
            num = input.nextInt();
            if (max < num) max = num;
            else min = num;
        }
        System.out.printf("Max number entered is %d%n",max);
        System.out.printf("Min number entered is %d%n", min);
    }
}