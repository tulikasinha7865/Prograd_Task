import  java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        byte num_first = sc.nextByte();
        System.out.println("Enter the second number");
        byte num_second = sc.nextByte();
        byte num_third;
        System.out.println("Numbers before swapping: "+"number1: "+num_first+" number2: "+num_second);
        num_third=num_first;
        num_first=num_second;
        num_second=num_third;
        System.out.println("Numbers after swapping: "+"number1: "+num_first+" number2: "+num_second);


    }
}
