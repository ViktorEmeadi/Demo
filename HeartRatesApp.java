package Snacks3;
import ChapterThree.HeartRates;

import java.util.Scanner;
public class HeartRatesApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your firstname:");
        String firstName = input.nextLine();

        System.out.println("Enter our lastname:");
        String lastName = input.nextLine();

        System.out.println("Enter date of birth:");
        String dateOfBirth = input.nextLine();
        HeartRates heartRates = new HeartRates(firstName,lastName,dateOfBirth);
        heartRates.setFirstName(firstName);
        heartRates.setLastName(lastName);
        heartRates.setDateOfBirth(dateOfBirth);

        System.out.printf("%s %s born in %s, going to be %d years of age. Your target heart rate is %s and your max heart rate is %s%n",heartRates.getFirstName(),
                heartRates.getLastName(), heartRates.getDateOfBirth(),heartRates.getAge(),heartRates.getTargetHeartRange(), heartRates.getMaxHeartRate());
    }
}
