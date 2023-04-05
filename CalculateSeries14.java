import java.util.Scanner;

public class CalculateSeries14 {
    // to find  sum of 1 + 1/2 + 1/3 +.......1/n
    //by user input
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter any positive integer");
        int n = scanner.nextInt();
        double sum =0.0;
        for (int i = 1; i<= n; i++){
            sum+=1.0/i;
        }
        System.out.println(" The sum of the series is" + sum);
    }
}
