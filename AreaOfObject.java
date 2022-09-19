import java.util.Scanner;
public class AreaOfObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape to find its area: ");
        System.out.println(" 1. Circle \n 2. Square \n 3. Rectangle \n 4. Triangle");
        byte choice = sc.nextByte();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the radius of circle:");
                double radius = sc.nextDouble();
                System.out.println("Area of circle: "+(3.14*radius*radius));
                break;
            case 2:
                System.out.println("Enter the side of square:");
                int side = sc.nextInt();
                System.out.println("Area of square: "+(side*side));
                break;
            case 3:
                System.out.println("Enter the length of rectangle:");
                int length = sc.nextInt();
                System.out.println("Enter the width of rectangle:");
                int width = sc.nextInt();
                System.out.println("Area of rectangle: "+(length*width));
                break;
            case 4:
                System.out.println("Enter the base of triangle:");
                int base = sc.nextInt();
                System.out.println("Enter the height of triangle:");
                int h = sc.nextInt();
                System.out.println("Area of triangle: "+(double)(0.5*base*h));
            default:
                System.out.println("Please choose from given option.");
        }
    }
}
