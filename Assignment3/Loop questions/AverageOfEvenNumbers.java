import java.util.Scanner;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

         
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {  
                sum += i;      
                count++;       
            }
        }

        int average = sum / count; 
        System.out.println("The average of all even numbers from 1 to " + n + " is " + average);
        scanner.close();
    }

}
