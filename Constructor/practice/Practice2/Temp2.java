class Temp2 
{
   int x = getX();
   int getX ()
   {
    System.out.println(x);
    return 20;
   } 
   Temp2()
   {
    System.out.println(x);
   }
   public static void main(String[] args)
   {
    Temp2 t1 = new Temp2();
     
   }
   
}
