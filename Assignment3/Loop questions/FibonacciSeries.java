/*write a program to print Fibonacci series of n terms where n is input by user.
  0 1 1 2 3 5 8 13 24 */
import java.util.Scanner;

public class FibonacciSeries  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initial two terms of Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}
