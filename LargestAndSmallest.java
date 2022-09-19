import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for (int i=0;i<n-1;i++)
        {
           if(max<arr[i+1])
           {
               max = arr[i+1];
           }
           if(min>arr[i+1])
           {
               min = arr[i+1];
           }
        }
        System.out.println("Largest Number : "+max);
        System.out.println("Smaller Number :"+min);
    }
}
