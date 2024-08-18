import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         
        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

         
        if (classesHeld == 0) {
            System.out.println("Number of classes held cannot be zero.");
        } else {
            
            double percentage = (double) classesAttended / classesHeld * 100;

            
            System.out.printf("Percentage of classes attended: %.2f%%\n", percentage);

            
            if (percentage >= 75) {
                System.out.println("The student is allowed to sit in the exam.");
            } else {
                System.out.println("The student is not allowed to sit in the exam.");
            }
        }

        scanner.close();
    }
}
