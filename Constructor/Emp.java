class Emp {
    int Salary;
    Emp()
    {
        Salary = 15000;
    }
    void show()
    {
        System.out.println(Salary);
    }
    public static void main(String[] args) {
        System.out.println(new Emp().Salary);

        new Emp().show();
        System.out.println(new Emp());
    }
}
