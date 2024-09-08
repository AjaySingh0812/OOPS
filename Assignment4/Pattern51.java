public class Pattern51 {
    public static void main(String[] args) {
        char start = 'E';  
        int i,j;  
        for ( i = 0; i < 5; i++) {
            for (j = start - i; j >= 'A' ; j--) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
