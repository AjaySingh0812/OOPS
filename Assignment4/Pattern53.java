class Pattern53 {
    public static void main(String[] args) {
        char start = 'E';  
        int i,j;  
        for ( i = 0; i < 5; i++) {
            char newchar = (char) (start-i);
            for (j = 0; j <5-i ; j++) {
                System.out.print(newchar );
            }
            System.out.println();
        }
    }
}
