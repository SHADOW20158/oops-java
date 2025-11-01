import java.util.Scanner;

public class AsciiToName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter ASCII values separated by spaces: ");
        String input = scanner.nextLine();

        String[] asciiValues = input.split(" ");
        StringBuilder name = new StringBuilder();

        for (String value : asciiValues) {
            int ascii = Integer.parseInt(value);
            char character = (char) ascii;
            name.append(character);
        }

        System.out.println("Your name is: " + name.toString());
    }
}
