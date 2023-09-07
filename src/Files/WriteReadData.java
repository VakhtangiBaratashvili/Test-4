package Files;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class WriteReadData {
    public static void main(String[] args) {
        File file = new File("Exercise12_15.txt");

        try {
            if (!file.exists()) {
                PrintWriter output = new PrintWriter(file);
                for (int i = 0; i < 100; i++) {
                    int randomInt = (int)(Math.random() * 1000);
                    output.print(randomInt + " ");
                }
                output.close();
            }
            Scanner input = new Scanner(file);
            int[] numbers = new int[100];
            int count = 0;
            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    numbers[count] = input.nextInt();
                    count++;
                } else {
                    input.next();
                }
            }
            input.close();

            Arrays.sort(numbers, 0, count);

            System.out.println("Data in increasing order:");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

