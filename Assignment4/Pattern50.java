 class Pattern50 {
    public static void main(String[] args) {
        char start = 'A';  
        int i,j;  
        for ( i = 0; i < 5; i++) {
            for (j = i; j < 5 ; j++) {
                System.out.print((char)(start + j));
            }
            System.out.println();
        }
    }
}
