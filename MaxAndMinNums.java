package Snacks3;
import java.util.Scanner;
public class MaxAndMinNums {
    public static void main(String[] args) {
        methodOne();
    }

    public static void methodOne(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number or enter 00 to terminate: ");
        int num = input.nextInt();
        int max = num;
        int min = num;
        while (num != 100){
            System.out.print("Enter a number or enter 00 to terminate: ");
            num = input.nextInt();
            if (num > max) max = num;
            if (num < min)min = num;
        }
        System.out.printf("Max number entered is %d%n",max);
        System.out.printf("Min number entered is %d%n", min);
        System.out.printf("The sum of the max and min is %d%n", max + min);
    }

    public static void methodTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or enter 101 to terminate");
        int num = input.nextInt();
        int max = num;
        int min = num;
        do {
            System.out.println("Enter a number or enter 101 to terminate");
            num = input.nextInt();
            if (num > max) max = num;
            if (num < min)min = num;
        }
        while (num != 101);
        System.out.printf("Max number entered is %d%n",max);
        System.out.printf("Min number entered is %d%n", min);
    }
}