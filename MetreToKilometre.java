import java.util.Scanner;
public class MetreToKilometre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in metre: ");
        int metre = sc.nextInt();
        System.out.println("Distance is kilometre: "+(metre/1000)+" km "+(metre%1000)+ " m");
    }
}
