import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // use will enter input
        System.out.println(" Enter Number");
        //scanner run user input
        int num = scanner.nextInt();
        for (int i=1;i<=12;i++)
        {
            System.out.println( num+ " * " + i + " = " + num * i);


    }
}}
