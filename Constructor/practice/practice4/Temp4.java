class Temp4 {
    int x ;
    int y;
    Temp4(int x , int y)
    {
        this.x = x;
        this.y = y;

    }
    void show()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Temp4 t1= new Temp4(10, 20);
        t1.show();
        Temp4 t2= new Temp4(100, 200);
        t2.show();
    }
}
