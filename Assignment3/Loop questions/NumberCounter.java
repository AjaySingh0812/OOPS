/* write a program to enter the numbers till user  wants 
and at the end it should displayed the count of positive, negative and zero entered. */

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers entered: " + positiveCount);
        System.out.println("Negative numbers entered: " + negativeCount);
        System.out.println("Zeroes entered: " + zeroCount);

        scanner.close();
    }
}
