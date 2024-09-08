 class Pattern9 {
    public static void main(String[] args) {
        int i,j;
        for (i = 1; i <= 5; i++) {  
            for ( j = 0; j < 5; j++) { 
                if (i % 2 == 1) {
                     
                    System.out.print("*");
                } else {
                     
                    System.out.print(i);
                }
            }
            System.out.println();  
        }
    }
}
