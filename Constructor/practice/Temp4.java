class Temp4
{
    int x;
    int y;
    Temp4()
    {
        x =10;
        y=20;

    }
    void show ()
    {
        System.out.println(x);
        System.out.println(y);
    }
     public static void main(String[] args) {
       Temp4 t1 = new Temp4();
       t1.show(); 

       Temp4 t2 = new Temp4();
       t2.show(); 
    }

}