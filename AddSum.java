package Snacks3;
import java.util.Scanner;
public class AddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int sentinel = 0;
        do {
            System.out.println("Enter a number");
            num1 = input.nextInt();

            System.out.println("Enter a number");
            num2 = input.nextInt();

            sum = num1 + num2;
            System.out.printf("The sum of %d and %d is %d%n", num1, num2, sum);
            System.out.println("Enter 1 to perform calculation again or press any number to terminate");
            sentinel = input.nextInt();
        }
        while(sentinel == 1);
        if (sentinel != 1) System.out.println("Exiting code...");
    }
}
