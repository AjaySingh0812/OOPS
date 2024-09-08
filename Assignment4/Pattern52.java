 class Pattern52 {
    public static void main(String[] args) {
        char start = 'A';  
        int i,j;  
        for ( i = 0; i < 5; i++) {
            for (j = 5-i; j > 0 ; j--) {
                System.out.print((char)(start + i));
            }
            System.out.println();
        }
    }
}
