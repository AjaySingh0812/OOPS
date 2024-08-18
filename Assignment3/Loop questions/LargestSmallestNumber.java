import java.util.Scanner;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        int number;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("The largest number entered is: " + largest);
        System.out.println("The smallest number entered is: " + smallest);

        scanner.close();
    }
}
