class Pattern34 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {  
            char startChar = (char) ('A' + i);  

            for (int j = 0; j <= i; j++) {  
                System.out.print(startChar);  
                startChar++;  
            }
            System.out.println();  
        }
    }
}
