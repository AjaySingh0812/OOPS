class Pattern21 {
    public static void main(String[] args) {
        int i,j;
        for(i=0; i<5;i++)
        {
            for(j=0;j<5;j++)
            { 
                if(i%2==0){
                System.out.print((char)('A'+ j));
            }
            else
            {
                System.out.print((char)('a'+j));
            }

        }
        System.out.println();
    }
}
}
