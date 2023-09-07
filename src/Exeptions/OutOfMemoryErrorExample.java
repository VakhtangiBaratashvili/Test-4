package Exeptions;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        try {
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Caught an OutOfMemoryError.");
        }
    }
}

