/*Java program that prints a right-angled triangle pattern of asterisks (*) aligned to the right: */

public class StarPattern3 {
    public static void main(String[] args) {
        int lines = 5;  

        for (int i = 1; i <= lines; i++) {  
             
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");  
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");  
            }
            
            System.out.println();
        }
    }   
}
