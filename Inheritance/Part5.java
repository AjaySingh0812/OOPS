class Base {
   static void show() {
        System.out.println("Base");
    }
}

class Child extends Base {  
    
     static void show() {  
        System.out.println("Child");
    }
}

  
public class Part5{
 public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();  
    }
}

