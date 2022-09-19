import  java.util.Scanner;
public class ArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Output after adding 5: ");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]+5);
        }
    }
}
