import  java.util.Scanner;
public class ArrayOfCubes {
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
        System.out.print("Square of elements are: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]*arr[i]+" ");
        }
        System.out.println();
        System.out.print("Cube of elements are: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]*arr[i]*arr[i]+" ");
        }
    }
}
