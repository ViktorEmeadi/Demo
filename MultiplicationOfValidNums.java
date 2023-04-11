package Snacks3;

import java.util.Scanner;

public class MultiplicationOfValidNums {
    public class MultiplicationOfValidNum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a valid integer");
            int num = input.nextInt();
            if (num > 0) {
                for (int count = 1; count <= 12; count++) {
                    System.out.println(count * num);
                }
            } else System.out.println("Enter a vald integer");
        }
    }
}
