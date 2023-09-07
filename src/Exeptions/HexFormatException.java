package Exeptions;

public class HexFormatException extends NumberFormatException {
    public HexFormatException(String message) {
        super(message);
    }
}