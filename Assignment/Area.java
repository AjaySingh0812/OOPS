import java.util.Scanner;

class Area {
    private double length;
    private double breadth; 

    public void setDim(double newLength, double newBreadth) {
        length = newLength;
        breadth = newBreadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Area rectangle = new Area(); 

        System.out.print("Enter length: ");
        double inputLength = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        double inputBreadth = scanner.nextDouble();
        
        rectangle.setDim(inputLength, inputBreadth);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
