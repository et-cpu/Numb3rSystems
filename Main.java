import java.util.Scanner;

/**
 * The {@code Main} class provides methods to convert a binary number
 * to octal, decimal, and hexadecimal values and then print them with specific
 * formatting.
 * <p>
 * The main method accepts a binary input from the user, converts it to decimal, and
 * then displays it.
 * </p>
 */

public class Main {

    /**
     * This is the main method of the program. It reads a binary number from the user,
     * converts it to an integer, and then displays its equivalent octal, decimal,
     * and hexadecimal.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a binary number (1 to 16 bits): ");
        String binaryInput = scanner.nextLine();

        // Validate input length
        if (binaryInput.length() < 1 || binaryInput.length() > 16 || !binaryInput.matches("[01]+")) {
            System.out.println("Not a valid input. Please re-enter a binary number of 1 to 16 bits.");
            return;
        }

        // Parse the binary string to an integer
        int decimalValue = Integer.parseInt(binaryInput, 2);
        System.out.println("Binary Input: " + binaryInput);

        // Print results for each base
        printOctal(decimalValue);
        printDecimal(decimalValue);
        printHexadecimal(decimalValue);
    }

    /**
     * Converts the given decimal value to its octal value and prints each
     * digit along with the power of 8 associated with it.
     *
     */

    public static void printOctal(int value) {
        System.out.println("\nOctal value: " + Integer.toOctalString(value));
        String octalString = Integer.toOctalString(value); // Get the octal representation as a string
        int[] octalPowers = {1, 8, 512, 4096, 32768, 262144}; // Octal positional powers

        for (int i = 0; i < octalString.length(); i++) {
            int digitValue = Character.getNumericValue(octalString.charAt(octalString.length() - 1 - i));
            System.out.printf("%-8d%d\n", octalPowers[i], digitValue);
        }
    }

    /**
     * Converts the given decimal value to its decimal value and prints each
     * digit along with the power of 10 associated with it.
     *
     */

    public static void printDecimal(int value) {
        System.out.println("\nDecimal value: " + value);
        String decimalString = Integer.toString(value); // Get the decimal representation as a string
        int[] decimalPowers = {1, 10, 100, 1000, 10000, 100000}; // Decimal positional powers

        for (int i = 0; i < decimalString.length(); i++) {
            int digitValue = Character.getNumericValue(decimalString.charAt(decimalString.length() - 1 - i));
            System.out.printf("%-8d%d\n", decimalPowers[i], digitValue);
        }
    }

    /**
     * Converts the given decimal value to its hexadecimal value and prints each
     * digit along with the power of 16 associated with it.
     *
     */

    public static void printHexadecimal(int value) {
        System.out.println("\nHexadecimal value: " + Integer.toHexString(value));
        String hexString = Integer.toHexString(value); // Get the hexadecimal representation as a string
        int[] hexPowers = {1, 16, 256, 65536}; // Hexadecimal positional powers

        for (int i = 0; i < hexString.length(); i++) {
            int digitValue = Character.getNumericValue(hexString.charAt(hexString.length() - 1 - i));
            String hexDigit = Character.toString(hexString.charAt(hexString.length() - 1 - i));
            System.out.printf("%-8d%-8d%s\n", hexPowers[i], digitValue, hexDigit);
        }
    }
}














