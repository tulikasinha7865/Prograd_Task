import java.util.Scanner;
public class PrimenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num<=1)
        {
            System.out.println(num+" is not prime");
        }
        for (int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not prime");
            }
            else
            {
                System.out.println(num+" is prime");
            }
        }



    }
}

