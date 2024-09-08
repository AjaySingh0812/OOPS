public class Pattern35 {
    public static void main(String[] args) {
        int  i,j;

        for ( i = 0; i < 5; i++) {
            for ( j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
