/*Java program that prints a right-angled triangle pattern of asterisks (*) */

public class StarPattern2 {
    public static void main(String[] args) {
        int lines = 5;  

        for (int i = 1; i <= lines; i++) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");  
            }
            System.out.println();  
        }
    }
}
