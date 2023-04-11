package Snacks3;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        int factorial = 1;
        for (int count = 2; count <= num; count++){
            factorial *= count;
        }
        System.out.printf("The factorial of %d is %d%n",num,factorial);
    }
}
