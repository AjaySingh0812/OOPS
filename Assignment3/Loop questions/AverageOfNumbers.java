import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

         
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

         
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

         
        int average = sum / n;

         
        System.out.println("The average of all numbers from 1 to " + n + " is " + average);
        scanner.close();
    }
}
