import java.util.Scanner;

public class ConvertToMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        byte num = sc.nextByte();
        byte month,days;
        month = (byte)(num/30);
        days = (byte)(num%30);
        System.out.println(num+" Days= "+month+ " months and "+days +" days");

    }


}
