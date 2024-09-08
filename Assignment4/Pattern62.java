 class Pattern62 {
    public static void main(String[] args) {
        int i,j;  
        int start = 1;  

        for ( i = 1; i <= 4; i++) {
            int currentNum = start;
            for ( j = 0; j < i; j++) {
                System.out.print(currentNum--);
            }
            System.out.println();
            start += i;   
        }
    }
}
