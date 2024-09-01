class Temp1 {
    int x ;
    int y;
    Temp1(int x , int y)
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
        Temp1 t1= new Temp1(10, 20);
        t1.show();
        Temp1 t2= new Temp1(100, 200);
        t2.show();
    }
}
