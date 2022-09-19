import java.util.Scanner;
public class PercentageCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        int percentage= sc.nextInt();
        System.out.println((percentage>=40)?"Pass":"Fail");
    }
}
