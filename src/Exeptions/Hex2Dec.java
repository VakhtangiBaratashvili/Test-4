package Exeptions;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine().toUpperCase();

        try {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex));
        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);

            if (!isHexChar(hexChar)) {
                throw new HexFormatException("Invalid hex string.");
            }

            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static boolean isHexChar(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F');
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}

