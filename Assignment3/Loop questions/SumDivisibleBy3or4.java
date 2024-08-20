import java.util.Scanner;

public class SumDivisibleBy3or4 {
     
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int sum = 0;

         
        for (int i = start; i <= end; i++) {
             
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i; 
            }
        }

        
        System.out.println("The sum of numbers divisible by 3 or 4 between " + start + " and " + end + " is " + sum);
        scanner.close();
    }
}
