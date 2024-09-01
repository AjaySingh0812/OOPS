class Pattern6 {
    public static void main(String[] args) {
        int i,j;
        
        for( i=0;i<5;i++)
        {
            if (i%2==0){
                for( j=0;j<5;j++){
                    System.out.print(1);
                }
            }
            else
            {
                for ( j=0;j<5;j++){
                    System.out.print(0);
                }
            }
            
            System.out.println();
        }
    }
}
