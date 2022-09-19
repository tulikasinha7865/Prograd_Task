import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int num = sc.nextInt();
        int n=0,decimal=0;
        if(isBinary(num))
        {
            while(true)
            {
                if(num == 0)
                {
                    break;
                }
                else
                {
                    int temp = num%10;
                    decimal += temp*Math.pow(2, n);
                    num = num/10;
                    n++;
                }
            }
            System.out.println("Decimal value: "+decimal);
        }
        else
        {
            System.out.println("Binary value only consist of 0 and 1. Please check the input");
        }

    }
    public static boolean isBinary(int num)
    {
        int r=0,c=0;
        while(num>0)
        {
            if((num %10==0)|| (num%10==1))
                c++;
            r++;
            num=num/10;
        }
        if(c!=r)
        {
            return  false;
        }
        return true;
    }
}
