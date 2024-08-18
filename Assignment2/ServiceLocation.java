import java.util.Scanner;

public class ServiceLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user input
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter sex (M or F): ");
        char sex = scanner.next().charAt(0);
        System.out.print("Enter marital status (Y or N): ");
        char maritalStatus = scanner.next().charAt(0);

        // Determine place of service
        if (sex == 'F' || sex == 'f') {
            System.out.println("You will work only in urban areas.");
        } else if (sex == 'M' || sex == 'm') {
            if (age >= 20 && age <= 40) {
                System.out.println("You may work anywhere.");
            } else if (age > 40 && age <= 60) {
                System.out.println("You will work only in urban areas.");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("Invalid input for sex.");
        }

        scanner.close();
    }
}
