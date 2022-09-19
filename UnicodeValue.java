import java.util.Scanner;
public class UnicodeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.nextLine().charAt(0);
        int n = (int)ch;
        System.out.println("Unicode value: "+n);

    }
}
