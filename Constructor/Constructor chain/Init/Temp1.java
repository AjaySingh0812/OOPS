class Temp1 {
    int x ;
    {
        System.out.println("init block");
        this .x = 10;

    }
    Temp1()
    {
        System.out.println("default");
        System.out.println(x);
    }
    {
        System.out.println("second");
    }
    Temp1(int x )
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Temp1();
        new Temp1(10);
        new Temp1();
    }
}
