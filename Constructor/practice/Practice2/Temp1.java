class Temp1
{
   int x = getX();
   int getX ()
   {
    System.out.println(x);
    return 20;
   } 
   Temp1()
   {
    System.out.println(x);
   }
   public static void main(String[] args)
   {
    Temp1 t1 = new Temp1();
     
   }
   
}
