import java.util.Scanner;

public class AttendanceCheck1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         
        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

        
        System.out.print("Do you have a medical cause (Y/N)? ");
        char hasMedicalCause = scanner.next().charAt(0);

         
        double percentage = 0.0;
        if (classesHeld > 0) {
            percentage = (double) classesAttended / classesHeld * 100;
        } else {
            System.out.println("Number of classes held cannot be zero.");
            scanner.close();
            return; 
        }

         
        System.out.printf("Percentage of classes attended: %.2f%%\n", percentage);

         
        if (percentage >= 75 || Character.toUpperCase(hasMedicalCause) == 'Y') {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam.");
        }

        
        scanner.close();
    }
}
