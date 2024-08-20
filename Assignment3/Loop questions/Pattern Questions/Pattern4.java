public class Pattern4 {
    public static void main(String[] args) {
        int maxStars = 5; // The maximum number of stars in the middle row

        // Print the upper part  
        for (int i = 1; i <= maxStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower part 
        for (int i = maxStars - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
