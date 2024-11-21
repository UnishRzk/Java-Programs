import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            sc.close();
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial of " + n + " is " + fact);
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }



    }
}
