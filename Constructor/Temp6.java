class Temp6 {
    int x;
    int y;
    Temp6 (int x, int y)
    {
        this.x =x;
        this.y=y;
    }
    void show ()
    {
        System.out.println(x);
        System.out.println(y);
    }
    Temp6 (Temp6 z)
    {
        this.x = z.x;
        this.y = z.y;
    }
    public static void main(String[] args) {
        Temp6 t1 = new Temp6(10, 20);
        t1.show();

        Temp6 t2 = new Temp6(t1);
        t2.show();

    }
}
