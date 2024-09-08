class Pattern30 {
    public static void main(String[] args) {
        int i,j;  

        for (i = 0; i < 5; i++) {  
            char startChar = (char) ('A' + i * (i + 1) / 2);  
               
            for ( j = i; j >= 0; j--) {
                System.out.print(startChar - j);
            }
            System.out.println();  
        }
    }
}
