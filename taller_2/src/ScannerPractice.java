import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("name: " + name);
    }
}
