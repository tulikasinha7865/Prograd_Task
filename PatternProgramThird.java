import java.util.Scanner;
public class PatternProgramThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=n;j<n+1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
