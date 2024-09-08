class Base {
    void show() {
        System.out.println("Base");
    }
}

class Child extends Base {  
    
    void show() {  
        System.out.println("Child");
    }
}

  
public class Part1{
 public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();  
    }
}

