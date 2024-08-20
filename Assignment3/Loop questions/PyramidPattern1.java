/*Java program that prints a Pyramid pattern of asterisks (*) */

public class PyramidPattern1 {
    public static void main(String[] args) {
        int lines = 5;  

        for (int i = 1; i <= lines; i++) {  
            
            for (int j = lines; j > i; j--) {
                System.out.print(" ");  
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i); 
            }
            
            System.out.println();
        }
    }  
}
