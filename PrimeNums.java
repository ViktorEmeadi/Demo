package Snacks3;

import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count;
        boolean checkPrime = false;
        if (num <= 1 ) System.out.printf("%d is not a prime number", num);
        else {
            for (count = 2; count <= num / 2; count++) {
                if (num % count == 0) checkPrime = true;
            }
            if (!checkPrime) System.out.printf("%d is a prime number", num);
            else System.out.printf("%d is not a prime number", num);
        }
    }
}
