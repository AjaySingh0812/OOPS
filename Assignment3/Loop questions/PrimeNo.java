
class Primeno
{
    public static void main (String[] args)
    {
        System.out.println("Enter the value 1");
        int x1 = new java.util.Scanner(System.in).nextInt();
        // String name = new jaba.util.Scanner(System.in).nextline();
        int count = 0;
        for (int i=1; i<=x1;i++)
        {
            int z=x1%i;
            if (z==0)
            {
                count++;
            }
        }
        if (count==2)
        System.out.println("It is a prime no");
        else
        System.out.println("It is a not prime no");
        

    }
}