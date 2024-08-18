import java.util.Scanner;
class Mobike
{
String bno;
String name;
int days;
int charge;

public void get() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Bike number");
		bno = sc.nextLine();
		System.out.println("Enter the Customer Name");
		name = sc.nextLine();
		System.out.println("Enter the no of days");
		days = sc.nextInt();
}
public void compute() {
	if(days<=5)
		{
			charge=500*days;
		}
		else if(days>5 && days<=10)
		{
			charge=2500+400*(days-5);
		}
		else if(days>10)
		{
			charge=2500+2000+200*(days-10);
		}
}

public void display() {
	System.out.print("Bike no"+"\t\t"+"Customer name"+"\t"+"Days"+"\t"+"Charge");
		System.out.println(" ");
		System.out.print(bno+"\t\t\t");
		System.out.print(name+"\t");
		System.out.print(days+"\t");
		System.out.print(charge+"\t");
}

public static void main(String args[]) {
	Mobike obj = new Mobike();
	obj.get();
	obj.compute();
	obj.display();
}

}