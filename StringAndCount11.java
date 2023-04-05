
import java.util.Scanner;

public class StringAndCount11 {
    public static void main(String[] args) {
        // counting the number  'a' from given string
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int count =0;
        for (int i=0;i<string.length();i++)
        {if (string.charAt(i)=='a'){
            count++;
        }
    }
        System.out.println("Total number of 'a ' in the string"+ count);
    }}