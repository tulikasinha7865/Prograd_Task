import java.util.Scanner;
public class SumOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of first matrix: ");
        int matrix1_i=sc.nextInt();
        System.out.println("Enter the column of first matrix: ");
        int matrix1_j=sc.nextInt();
        System.out.println("Enter the row of second matrix: ");
        int matrix2_i=sc.nextInt();
        System.out.println("Enter the column of second matrix: ");
        int matrix2_j=sc.nextInt();
        int[][] arr1 = new int[matrix1_i][matrix1_j];
        int[][] arr2 = new int[matrix2_i][matrix2_j];
        if(matrix1_i != matrix2_i || matrix1_j !=matrix2_j)
        {
            System.out.println("The size of both matrix should be equivalent");
        }
        else
        {
            System.out.println("Enter the elements for first matrix: ");
            for (int i=0;i<matrix1_i;i++)
            {
                for (int j=0;j<matrix1_j;j++)
                {
                    System.out.println("Enter a element");
                  arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements for second matrix: ");
            for (int i=0;i<matrix2_i;i++)
            {
                for (int j=0;j<matrix2_j;j++)
                {
                    System.out.println("Enter a element");
                    arr2[i][j] = sc.nextInt();
                }
            }
            System.out.println("First matrix: ");
            for (int i=0;i<matrix1_i;i++)
            {
                for (int j=0;j<matrix1_j;j++)
                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Second matrix: ");
            for (int i=0;i<matrix2_i;i++)
            {
                for (int j=0;j<matrix2_j;j++)
                {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Addition of matrix: ");
            for (int i=0;i<matrix2_i;i++)
            {
                for (int j=0;j<matrix2_j;j++)
                {
                    System.out.print(arr1[i][j]+arr2[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
