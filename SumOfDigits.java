import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum =0;
        sum =  (num%10)+(num/10)%10+(num/100);
        System.out.println("Sum of digits: "+sum);


    }
}
