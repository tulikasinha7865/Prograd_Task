import java.util.Scanner;
public class BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        double basic_salary = sc.nextDouble();
        double ta,da,hra,pf,bonus,gross_salary;
        ta = basic_salary * 0.1;
        da = basic_salary * 0.15;
        hra = basic_salary * 0.2;
        pf = basic_salary * 0.12;

        if(basic_salary >= 20000)
        {
            bonus = basic_salary * 0.1;
            System.out.println("Gross Salary: "+((basic_salary+da+ta+hra+bonus)-pf));
        }
        else
        {
            bonus = basic_salary*0.2;
            System.out.println("Gross Salary: "+((basic_salary+da+ta+hra+bonus)-pf));
        }
    }
}
