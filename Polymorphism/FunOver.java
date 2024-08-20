class FunOver{
    static void show()
    {
        System.out.println("Zero arguments");
    }
    static void show (int x)
    {
        System.out.println("one arguments");
    }
    static void show (int x, int y)
    {
        System.out.println("Two arguments"); 
    }
    static void show (int x, int y, int z)
    {
        System.out.println("Three arguments");
    }
    public static void main (String...s)
    {
        show ();
        show (10);
        show (10,10);
        show (10,10,10);
    }
}