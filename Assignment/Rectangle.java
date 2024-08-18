import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length : ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth : ");
        double breadth = scanner.nextDouble();

        if (length == breadth) {
            System.out.println(" rectangle is  square.");
        } else {
            System.out.println(" rectangle is not  square.");
        }

        scanner.close();
    }
}
