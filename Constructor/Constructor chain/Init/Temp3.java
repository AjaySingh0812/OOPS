class Temp3 {
    int x;
    {
        System.out.println("init block");
        this.x = 10;
    }
    Temp3()
    {
        System.out.println("default");
        System.out.println(x);
    }
    {
        System.out.println("second");
    }
    Temp3 (int x)
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Temp3();
        new Temp3(10);
        new Temp3();
    }
}
