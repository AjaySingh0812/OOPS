import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         
        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();
        System.out.print("Enter the third value: ");
        int thirdValue = scanner.nextInt();

         
        int[] values = {firstValue, secondValue, thirdValue};

       
        Arrays.sort(values);

         
        System.out.println("Values in ascending order: " + values[0] + ", " + values[1] + ", " + values[2]);

        scanner.close();
    }
}
