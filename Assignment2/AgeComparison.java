import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age of the first person: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter the age of the second person: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter the age of the third person: ");
        int age3 = scanner.nextInt();

        int oldest = age1;
        int youngest = age1;

        if (age2 > oldest) oldest = age2;
        if (age3 > oldest) oldest = age3;

        if (age2 < youngest) youngest = age2;
        if (age3 < youngest) youngest = age3;

        System.out.println("The oldest person is " + oldest + " years old.");
        System.out.println("The youngest person is " + youngest + " years old.");

        scanner.close();
    }
}
