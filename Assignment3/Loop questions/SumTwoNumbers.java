/*write a do-while loop that asks the user to enter two numbers. 
The numbers should be added and the sum displayed.
 The loop should ask the user whether he or she wishes to perform the operation again .
 If so, the loops should repeat; otherwise it should terminate.*/

 
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to perform the operation again? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
