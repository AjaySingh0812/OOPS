//Two numbers are entered through the keyboard . 
//write a program to find the value of one number raised to the power of another. 
//(Do not use java built-in-method)

public class PowerCalculation {
    public static void main(String[] args)
     {
        System.out.print("Enter the base number: ");
        int base = new java.util.Scanner(System.in).nextInt();

        System.out.print("Enter the exponent number: ");
        int exponent = new java.util.Scanner(System.in).nextInt();

         
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
