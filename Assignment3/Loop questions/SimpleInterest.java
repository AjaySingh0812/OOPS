import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter Principal amount: ");
        int principal = scanner.nextInt();

        System.out.print("Enter Rate of interest: ");
        int rate = scanner.nextInt();

        System.out.print("Enter Time (in years): ");
        int time = scanner.nextInt();

         
        int simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is: " + simpleInterest);
        scanner .close();
    }
}
