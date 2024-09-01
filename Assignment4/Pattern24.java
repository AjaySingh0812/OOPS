class Pattern24 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<i+i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
