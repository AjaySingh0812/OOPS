import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble(); 
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }
        System.out.println("Your net bonus amount is: " + bonus); 
        scanner.close();
    }
}

