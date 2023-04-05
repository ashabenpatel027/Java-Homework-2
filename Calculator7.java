import java.util.Scanner;

public class Calculator7 {
    public static void main(String[] args) {
        // making Calculator by user input
        Scanner scanner =new Scanner(System.in);
        // use need to put 3 input one by one
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Select Symbol (+, -, * ,/ )");
        String symbol = scanner.next();
        int result;
        //answer will come base on user chosen symbol
        switch (symbol)
        {
        case "+": result=number1+num2;
            System.out.println(" Addition is :" + result);
            break;
            case "-": result= number1-num2;
                System.out.println("Subtraction is :" + result);
                break;
            case "*": result=number1*num2;
                System.out.println("Multiplication is : " + result);
                break;
            case "/": result= number1/num2;
                System.out.println("Division is :" + result);
                break;
            default:
                System.out.println("Invalid Symbol");
                break;
    }
}}
