import java.util.Scanner;

public class DecimalToBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int arr[] = new int[40];
        int i = 0;
        while(n> 0)
        {
            arr[i++] = n%2;
            n = n/2;
        }
        System.out.print("Binary value: ");
        for(int j = i-1;j >= 0;j--)
        {
            System.out.print(arr[j]);
        }


    }
}
