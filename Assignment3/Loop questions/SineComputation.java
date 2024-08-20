import java.util.Scanner;

public class SineComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x (in radians): ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double sinX = 0.0;

        for (int i = 0; i < n; i++) {
            
            int power = 2 * i + 1;
            double term = Math.pow(x, power) / factorial(power);

            if (i % 2 == 0) {
                sinX += term;  
            } else {
                sinX -= term;  
            }
        }
 
        System.out.println("sin(" + x + ") = " + sinX);
        scanner.close();
    }

     
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
