import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int num1,rem,res=0;
        num1 = num;
        while (num1 !=0)
        {
            rem = num1 % 10;
            res = (int) (res + Math.pow(rem, 3));
            num1 /=10;
        }
        if(res == num)
        {
            System.out.println(num+ " is a Armstrong number.");
        }
        else
        {
            System.out.println(num+ " is not a Armstrong number.");
        }
    }
}
