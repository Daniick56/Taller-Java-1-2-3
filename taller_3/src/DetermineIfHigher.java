import java.util.Scanner;

public class DetermineIfHigher {
    public static void main (String[] args){

        Scanner scanning = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstOne = scanning.nextInt();
        System.out.println("Enter the second number: ");
        int secondOne = scanning.nextInt();

        if(firstOne > secondOne)
        {
            System.out.println(firstOne + " Is higher than " + secondOne);
        } else if (secondOne > firstOne)
        {
            System.out.println(secondOne + " Is higher than " + firstOne);
        } else
        {
            System.out.println("They are equals.");
        }
    }
}
