import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price per item: ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity of the item: ");
        int quantity = sc.nextInt();
        double total_amount,discount;
        total_amount = (double)price*quantity;
        discount = (total_amount*10)/100;
        if(quantity>=10)
        {
            System.out.println("Total amount to be paid: "+(total_amount - discount));
        }
        else
        {
            System.out.println("Total amount to be paid: "+total_amount);
        }
    }
}
