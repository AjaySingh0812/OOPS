class Pattern61 {
    public static void main(String[] args) {
        int i,j; // Number of rows

        for ( i = 1; i <= 4; i++) {
            for ( j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
