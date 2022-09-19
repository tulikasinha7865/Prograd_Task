import java.util.Scanner;
public class ZaggedArray {
    public static void main(String[] args) {


        //Jagged array .. is a two d array where variable number of columns in each row

        Scanner sc = new Scanner(System.in);
        //System.out.println("How many rows you want");
        //byte row =  sc.nextByte();

        int [][]arr= new int[3][]; // jagged array
        for(int i = 0;i<3;i++) {
            System.out.println("Enter the number of columns for  " + (i + 1) + "  row");
            int col = sc.nextInt();
            arr[i] = new int[col];
        }

        for(int i =0;i< arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                System.out.println("Enter element ");
                arr[i][j]=sc.nextInt();
            }
        }


        System.out.println("Array is :");
        for(int i =0;i< arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + "  ");

            }
            System.out.println();
        }

    }
}



