import java.util.Scanner;

public class ReverseNum04 {
    //user need to put fwe number in raw and get it in reverse series

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" enter any number");
        int number= input.nextInt();
        int reversnumber =0;
        for (; number != 0;number/=10){
            int digit =number % 10;
            reversnumber=reversnumber * 10 + digit;
        }
        System.out.println("Revers number"  + reversnumber);
        }
}

