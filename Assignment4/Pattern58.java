class Pattern58 {
    public static void main(String[] args) {
        int i,j; 
        for ( i = 0; i < 5; i++) 
        {
            for ( j = 0; j <5- i; j++) 
            {
                 
                if ((j+i)% 2 == 0) 
                {
                    System.out.print('1');
                } else {
                    System.out.print('0');
                }
            }
             
            System.out.println();
        }
    } 
}
