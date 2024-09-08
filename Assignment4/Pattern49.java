class Pattern49{
    public static void main(String[] args) {
        char start = 'E';  
        int i,j;  
        for ( i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                System.out.print((char)(start - j));
            }
            System.out.println();
        }
    }
}