class Temp3{
    Temp3()
    {
        this(10);
        System.out.println("default");
    }
    Temp3 (int x )
    {
        this (10,20);
        System.out.println(x); 
    }
    Temp3( int x , int y)
    {
        System.out.println(x + y);
    }
    public static void main(String[] args) {
        new Temp3();
    }
}
