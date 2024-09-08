class Base {
    public void show() {
        System.out.println("Base");
    }
}

class Child extends Base {  
    
     protected void show() {  
        System.out.println("Child");
    }
}

  
public class Part4{
 public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();  
    }
}

