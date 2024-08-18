//Write a program that prompts the user to input a positive integer. 
//It should then print the multiplication table of that number.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        // Validate that the input is a positive integer
        while (number <= 0) {
            System.out.println("Please enter a positive integer:");
            number = scanner.nextInt();
        }

        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
