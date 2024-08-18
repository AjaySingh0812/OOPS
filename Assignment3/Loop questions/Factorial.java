//write  a program to find the factorial value of any number entered through the keyboard.

public class Factorial {
    public static void main(String[] args) {
         

        System.out.print("Enter a positive integer: ");
        int number = new java.util.Scanner(System.in).nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);

        
    }
}
