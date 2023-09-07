package Exeptions;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        try {
            System.out.println("The decimal value for binary number " + binary + " is " + binToDecimal(binary));
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int binToDecimal(String binary) throws BinaryFormatException {
        int decimalValue = 0;

        for (int i = 0; i < binary.length(); i++) {
            char binChar = binary.charAt(i);

            if (!isBinChar(binChar)) {
                throw new BinaryFormatException("Invalid binary string.");
            }

            decimalValue = decimalValue * 2 + binCharToDecimal(binChar);
        }

        return decimalValue;
    }

    public static boolean isBinChar(char ch) {
        return ch == '0' || ch == '1';
    }

    public static int binCharToDecimal(char ch) {
        return ch - '0';
    }
}
