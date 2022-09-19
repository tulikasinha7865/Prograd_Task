import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int i = 2; i< num; i++)
        {
            while(num%i == 0)
            {
                System.out.println(i+" ");
                num /= i;
            }
        }
        System.out.println(num);
    }

}
