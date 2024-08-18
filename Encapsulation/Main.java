class Emp {
    static String Cname = "TCS";
    String name;
    int salary;

    // Method to initialize name and salary
    void get(String S1, int S2) {
        name = S1;
        salary = S2;
    }

    // Method to display name and salary
    void show() {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(Emp.Cname); 
    }

}

public class Main {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.get("Ajay", 25000);
        e1.show();
    }
}