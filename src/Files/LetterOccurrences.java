package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LetterOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        String filename = scanner.nextLine();

        File file = new File(filename);
        try {
            Scanner fileScanner = new Scanner(file);

            HashMap<Character, Integer> letterCounts = new HashMap<>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                line = line.toLowerCase();

                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
                    }
                }
            }

            // Display letter counts
            for (char c = 'a'; c <= 'z'; c++) {
                int count = letterCounts.getOrDefault(c, 0);
                System.out.println("Number of " + c + "'s: " + count);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

