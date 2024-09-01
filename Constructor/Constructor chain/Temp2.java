  class Temp2 {
    Temp2()
    {
        this(10);
        System.out.println("default");
    }
    Temp2(int x)
    {
        this(20,10);
        System.out.println(x);
    }
    Temp2(int x , int y)
    {
        System.out.println(x + y);
    }
    public static void main(String[] args) {
        new Temp2();
    }
}
