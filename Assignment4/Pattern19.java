class Pattern19 {
    public static void main(String[] args) {
        char letter= 'A';
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
}
