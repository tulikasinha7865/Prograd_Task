import java.util.Scanner;
public class MenuGivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from the given options: ");
        System.out.println(" 1. Find number is even or odd \n 2. Find number is positive or negative. \n 3. Find maximum between given two numbers \n 4. Convert days into months and remaining days");
        byte choice = sc.nextByte();
        switch (choice)
        {
            case 1:
                System.out.println("Enter the number: ");
                int num = sc.nextInt();
                if(num >=1)
                {
                    if(num%2==0)
                    {
                        System.out.println(num+" is a even number");
                    }
                    else
                    {
                        System.out.println(num+" is a odd number");
                    }
                }
                break;
            case 2:
                System.out.println("Enter the number: ");
                int num1 = sc.nextInt();
                if(num1>=0)
                {
                    System.out.println(num1+ " is a positive number");
                }
                else
                {
                    System.out.println(num1+" is a negative number");
                }
                break;
            case 3:
                System.out.println("Enter the first number: ");
                int first_num = sc.nextInt();
                System.out.println("Enter the second number: ");
                int second_num = sc.nextInt();
                if(first_num>second_num)
                {
                    System.out.println(first_num+ " is greater");
                }
                else
                {
                    System.out.println(second_num+ " is greater");
                }
                break;
            case 4:
                System.out.println("Enter the number of days: ");
                int days = sc.nextInt();
                System.out.println(days+"= "+(days/30)+" months "+(days%30)+ " days");
                break;
            default:
                System.out.println("Please choose from given options.");
                break;
        }

    }
}
