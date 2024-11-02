import java.util.Scanner;

public class Main {

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
        System.out.println("Input: " + binaryInput);

        // Print results for each base
        printOctal(decimalValue);
        printDecimal(decimalValue);
        printHexadecimal(decimalValue);
    }

    public static void printOctal(int value) {
        System.out.println("\nOctal: " + Integer.toOctalString(value));
        String octalString = Integer.toOctalString(value); // Get the octal representation as a string
        int[] octalPowers = {1, 8, 512, 4096, 32768, 262144}; // Octal positional powers

        for (int i = 0; i < octalString.length(); i++) {
            int digitValue = Character.getNumericValue(octalString.charAt(octalString.length() - 1 - i));
            System.out.printf("%-8d%d\n", octalPowers[i], digitValue);
        }
    }

    public static void printDecimal(int value) {
        System.out.println("\nDecimal: " + value);
        String decimalString = Integer.toString(value); // Get the decimal representation as a string
        int[] decimalPowers = {1, 10, 100, 1000, 10000, 100000}; // Decimal positional powers

        for (int i = 0; i < decimalString.length(); i++) {
            int digitValue = Character.getNumericValue(decimalString.charAt(decimalString.length() - 1 - i));
            System.out.printf("%-8d%d\n", decimalPowers[i], digitValue);
        }
    }

    public static void printHexadecimal(int value) {
        System.out.println("\nHexadecimal: " + Integer.toHexString(value));
        String hexString = Integer.toHexString(value); // Get the hexadecimal representation as a string
        int[] hexPowers = {1, 16, 256, 65536}; // Hexadecimal positional powers

        for (int i = 0; i < hexString.length(); i++) {
            int digitValue = Character.getNumericValue(hexString.charAt(hexString.length() - 1 - i));
            String hexDigit = Character.toString(hexString.charAt(hexString.length() - 1 - i));
            System.out.printf("%-8d%-8d%s\n", hexPowers[i], digitValue, hexDigit);
        }
    }
}














