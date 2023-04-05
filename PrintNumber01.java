import java.util.Scanner;

public class PrintNumber01 {
    public static void main(String[] args) {
    //print any 10 num given by user
    Scanner p= new Scanner(System.in);
        System.out.println("Enter any First number");
        int num = p.nextInt();
        System.out.println("Enter second number");
        int num2= p.nextInt();
        for (num=num; num<=num2;num++){
            System.out.println(num);
        }

}}
