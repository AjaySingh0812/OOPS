import java.util.Scanner;
public class ShopDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the quantity of items purchased: ");
        int quantity = scanner.nextInt();
        int unitCost = 100;
        int totalCost = quantity * unitCost;
        if (totalCost > 1000) 
        {
            totalCost -= totalCost * 0.10;  
        }
        System.out.println("The total cost for the user is: " + totalCost);

        scanner.close();
    }
}
