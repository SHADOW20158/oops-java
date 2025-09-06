import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, digit, sum = 0;

        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        // Handle negative numbers
        if (n < 0) {
            n = -n;
        }

        do {
            digit = n % 10;   // Extract last digit
            sum += digit;     // Add to sum
            n = n / 10;       // Remove last digit
        } while (n != 0);

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
