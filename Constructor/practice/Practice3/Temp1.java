class Temp1 {
    int x = getX(); // Call the getter method to initialize x
    
    int getX() {
        System.out.println( x);
        return 10;
    }
    
    Temp1() {
        
    }
    
    public void show() {
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        Temp1 t1 = new Temp1();
        t1.show();
    }
}
