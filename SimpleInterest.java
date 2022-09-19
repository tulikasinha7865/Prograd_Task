import java.util.Scanner;
public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal_amount = sc.nextDouble();
        System.out.println("Enter the duration of loan: ");
        double time = sc.nextDouble();
        final double rate=7.5;
        double simple_interest;
        simple_interest = ((principal_amount*time*rate)/100);
        System.out.println("Simple Interest: "+simple_interest);
        System.out.println("Final amount to be paid to the Bank: "+(simple_interest+principal_amount));
    }
}
