class Temp2 {
    int x ;
    {
        System.out.println("init block");
        this.x =10;
    }
    Temp2()
    {        
        System.out.println("default");
        System.out.println(x);

    }
    {
        System.out.println("second");
    }
    Temp2(int x )
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Temp2();
        new Temp2(10);
        new Temp2();
    }
}
