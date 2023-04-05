import java.util.Scanner;

public class NaturalNumber6 {
    public static void main(String[] args) {
        //scanner for user input
        //Display total of natural number by user input
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number");
        int num= sc.nextInt();
        int sum =0;
        for ( int i=1; i<=num; ++i)
        {
            sum = sum + i;
        }
        System.out.println("Sum of natural number " + sum);

    }

}


