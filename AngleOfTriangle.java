import java.util.Scanner;
public class AngleOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle of triangle: ");
        int angle1 = sc.nextInt();
        System.out.println("Enter the second angle of triangle: ");
        int angle2 = sc.nextInt();
        System.out.println("Third angle of triangle is: "+(180-(angle1+angle2)));
    }
}
