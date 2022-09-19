import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int num1=0,num2=1,fib;
        for (int i=2;i<num;i++)
        {
            fib = num1+num2;
            System.out.println(fib);
            num1 = num2;
            num2 = fib;
        }
    }
}
