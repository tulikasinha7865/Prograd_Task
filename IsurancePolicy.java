import java.util.Scanner;
public class IsurancePolicy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marital status(Unmarried/Married): ");
        String s = sc.next();
        if(s.equalsIgnoreCase("Married"))
        {
            System.out.println("Insurance can be done");
        }
        else if(s.equalsIgnoreCase("Unmarried"))
        {
            System.out.println("Enter your gender(male/female): ");
            String gender = sc.next();
            System.out.println("Enter the age: ");
            byte age = sc.nextByte();
            if(gender.equalsIgnoreCase("male") && age>=30)
            {
                System.out.println("Insurance can be done");
            }
            else if (gender.equalsIgnoreCase("female") && age>=25)
            {
                System.out.println("Insurance can be done");
            }
            else
            {
                System.out.println("Insurance cannot be done. Contact the company for more details");
            }
        }
    }
}
