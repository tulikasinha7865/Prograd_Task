import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        double area,perimetre;
        perimetre = 2*PI*radius;
        area = PI*radius*radius;
        System.out.println("Perimetre of circle: "+perimetre);
        System.out.println("Area of circle: "+area);

    }
}
