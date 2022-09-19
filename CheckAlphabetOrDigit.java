import java.util.Scanner;
public class CheckAlphabetOrDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        if(ch!=' ' && ch!='!' && ch!='@' && ch!='#' && ch!='$' && ch!='%' && ch!='^' && ch!='&' && ch!='*' && ch!='(' && ch!=')')
        {
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                System.out.println(ch+" is an alphabet.");
            }
            else
            {
                System.out.println(ch+" is a number");
            }
        }
    }
}
