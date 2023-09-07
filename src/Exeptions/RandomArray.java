package Exeptions;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {
        int[] randomArray = new int[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            randomArray[i] = random.nextInt(1000);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index of the array: ");
        int index = scanner.nextInt();

        try {
            int value = randomArray[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}

