import java.util.Scanner;
public class Profit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        float cp = sc.nextFloat();
        System.out.println("Enter the selling price: ");
        float sp = sc.nextFloat();
        System.out.println("Profit: "+(sp-cp));

    }
}
