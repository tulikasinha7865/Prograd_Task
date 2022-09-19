import java.util.Scanner;

public class ConditonalStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for English: ");
        int marks_english = sc.nextInt();
        System.out.println("Enter the marks for Hindi: ");
        int marks_hindi = sc.nextInt();
        System.out.println("Enter the marks for Maths: ");
        int marks_maths = sc.nextInt();
        double avg=0;
        if(marks_english>100 && marks_maths>100 && marks_hindi>100)
        {
            System.out.println("Marks cannot be greater than 100");
        }
        else
        {
            avg = (double)(marks_english+marks_hindi+marks_maths)/3;
            System.out.println("Average is:" +avg);
        }

    }

}
