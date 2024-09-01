class Temp3 
{
   int x = getX();
   int getX ()
   {
    System.out.println(x);
    return 20;
   } 
   Temp3()
   {
    System.out.println(x);
   }
   public static void main(String[] args)
   {
    Temp3 t1 = new Temp3();
     
   }
   
}
