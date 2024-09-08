class Pattern25 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print((i*2)-1-j);
            }
            System.out.println();
        }
    }
}
