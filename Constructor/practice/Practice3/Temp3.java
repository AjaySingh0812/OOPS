class Temp3 {
    int x = getX();   
    
    int getX() {
        System.out.println( x);
        return 10;
    }
    
    Temp3() {
        
    }
    
    public void show() {
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        Temp3 t1 = new Temp3();
        t1.show();
    }
}
