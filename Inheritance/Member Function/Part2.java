class Base {
      void show() {
       System.out.println("Base");
   }
}

class Child extends Base {  
    
     void show() {  
       System.out.println("Child");
       return 20;
   }
}

public class Part2 {  
   public static void main(String[] args) {
       Child c1 = new Child();
       c1.show();  
   }
}
