/*java program that prints a pyramid pattern of numbers */

public class PyramidPattern2 {
    public static void main(String[] args) {
        int lines = 5;  

        for (int i = 1; i <= lines; i++) {  
             
            for (int j = lines; j > i; j--) {
                System.out.print(" ");  
            }
             
            for (int k = i; k >= 1; k--) {
                System.out.print(k);  
            }
            
            for (int k = 2; k <= i; k++) {
                System.out.print(k);  
            }
             
            System.out.println();
        }
    }
}
