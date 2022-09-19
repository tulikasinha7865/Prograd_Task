import java.util.Scanner;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of matrix: ");
        int matrix1_i=sc.nextInt();
        System.out.println("Enter the column of matrix: ");
        int matrix1_j=sc.nextInt();
        int[][] arr1 = new int[matrix1_i][matrix1_j];
        System.out.println("Enter the elements for matrix: ");
            for (int i=0;i<matrix1_i;i++)
            {
                for (int j=0;j<matrix1_j;j++)
                {
                    System.out.println("Enter a element");
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Original matrix: ");
            for (int i=0;i<matrix1_i;i++)
            {
                for (int j=0;j<matrix1_j;j++)
                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Tranpose of Matrix: ");
            for (int i=0;i<matrix1_j;i++)
            {
                for (int j=0;j<matrix1_i;j++)
                {
                    System.out.print(arr1[j][i]+" ");
                }
                System.out.println();
            }
    }
}
