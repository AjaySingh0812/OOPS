class Pattern36 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<5;i++)
        {
            for(j=0;j< 5-i-1;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
             System.out.print('*');
            
            if (k<i){
            System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
