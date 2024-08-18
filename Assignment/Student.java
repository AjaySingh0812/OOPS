class Student
{
    String name;
    int roll_no;
    public static void main(String[] args)
    {
        Student student = new Student();
        student.name = "lalu";
        student.roll_no = 2;

        System.out.println("Student Name:" + student.name);
        System.out.println("Student Roll No:" + student.roll_no);
    }
}