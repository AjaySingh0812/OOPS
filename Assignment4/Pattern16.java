class Pattern16 {
    public static void main(String[] args) {
        char Ch ='A';
        for(int i=1;i<=5;i++)
        {
            Ch = 'A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(Ch+ "");
                Ch++;
            }
            System.out.println();
        }
    }
    
}
