import java.util.Scanner;

public class Factorial05 {

    //To check the value of factorial
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter the number");
        int no = scanner.nextInt();
        int fact =1;
        // use need to input the number

        for (int i=1; i<=no;i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + no + " is " + fact);
}}
