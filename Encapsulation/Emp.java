class Emp 
{
    static String Cname = "TCS";
    String name;
    int salary;

    // Method to initialize name and salary
    void get(String S1, int S2) 
    {
        name = S1;
        salary = S2;
    }

    // Method to display name and salary
    void show() 
    {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(Cname); 
    }
    static int add (int a , int b)
    {
        return a+b;
    }
     public static void main (String s[])
     {
        Emp e1 = new Emp();

        e1.get ("lalu",101);
        e1.show();
    System.out .println(Cname);
    System.out .println(Emp.Cname);
    int z = Emp.add(10,20);
    System.out.println(z);

    z=add (10,200);
    System.out.println(z);
     }
    
     }
     class Demo
     {
        public static void main(String s[])
        {
            Emp e2 = new Emp();
            e2.get("rabari",51);
            e2.show();
            int z = Emp.add(10, 30);
            System.out.println(z);
            System.out.println(Emp.Cname);
        }
 }



 