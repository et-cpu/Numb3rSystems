import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number (1 to 16 bits): ");
        String binaryInput = scanner.nextLine();

        // Validate input length and format
        if (binaryInput.length() < 1 || binaryInput.length() > 16 || !binaryInput.matches("[01]+")) {
            System.out.println("Invalid input. Please enter a binary number with 1 to 16 bits.");
            return;
        }

        // Convert binary to decimal
        int decimalValue = Integer.parseInt(binaryInput, 2);

        // Call methods to print octal, decimal, and hexadecimal breakdowns
        printOctal(decimalValue);
        printDecimal(decimalValue);
        printHexadecimal(decimalValue);

        scanner.close();
    }

    private static void printOctal(int decimalValue) {
        String octalValue = Integer.toOctalString(decimalValue);
        System.out.println("\nOctal breakdown:");

        List<String> octalResults = new ArrayList<>();
        for (int i = 0; i < octalValue.length(); i++) {
            int power = octalValue.length() - 1 - i;
            int digitValue = Character.getNumericValue(octalValue.charAt(i)) * (int) Math.pow(8, power);
            octalResults.add(String.format("%-8d%d", (int) Math.pow(8, power), digitValue));
        }

        // Print results in ascending order
        for (int i = 0; i < octalResults.size(); i++) {
            System.out.println(octalResults.get(i));
        }
        System.out.printf("Octal: %s%n", octalValue);
    }

    private static void printDecimal(int decimalValue) {
        String decimalString = Integer.toString(decimalValue);
        System.out.println("\nDecimal breakdown:");

        List<String> decimalResults = new ArrayList<>();
        for (int i = 0; i < decimalString.length(); i++) {
            int power = decimalString.length() - 1 - i;
            int digitValue = Character.getNumericValue(decimalString.charAt(i)) * (int) Math.pow(10, power);
            decimalResults.add(String.format("%-8d%d", (int) Math.pow(10, power), digitValue));
        }

        // Print results in ascending order
        for (int i = 0; i < decimalResults.size(); i++) {
            System.out.println(decimalResults.get(i));
        }
        System.out.printf("Decimal: %d%n", decimalValue);
    }

    private static void printHexadecimal(int decimalValue) {
        String hexValue = Integer.toHexString(decimalValue);
        System.out.println("\nHexadecimal breakdown:");

        List<String> hexResults = new ArrayList<>();
        for (int i = 0; i < hexValue.length(); i++) {
            int power = hexValue.length() - 1 - i;
            int digitValue = Character.digit(hexValue.charAt(i), 16) * (int) Math.pow(16, power);
            hexResults.add(String.format("%-8d%s", (int) Math.pow(16, power), hexValue.charAt(i)));
        }

        // Print results in ascending order
        for (int i = 0; i < hexResults.size(); i++) {
            System.out.println(hexResults.get(i));
        }
        System.out.printf("Hexadecimal: %s%n", hexValue);
    }
}





