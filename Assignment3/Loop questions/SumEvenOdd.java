//write a program that reads a set of integer , and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter the number of integers you want to input:");
        int n = scanner.nextInt();

        System.out.println("Enter the integers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

        scanner.close();
    }
}
