class Temp1 {
   Temp1()
   {
    this(10);
    System.out.println("default");
   } 
   Temp1(int x)
   {
    this(10,20);
    System.out.println(x);
   }
   Temp1(int x, int y)
   {
    System.out.println(x + y);
   }
   public static void main(String[] args) {
    new Temp1();
   }
}
