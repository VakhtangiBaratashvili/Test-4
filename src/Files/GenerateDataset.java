package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateDataset {

    public static void main(String[] args) {
        Random random = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Salary.txt"))) {
            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;

                String[] ranks = {"assistant", "associate", "full"};
                String rank = ranks[random.nextInt(ranks.length)];

                double minSalary, maxSalary;
                switch (rank) {
                    case "assistant":
                        minSalary = 50000.0;
                        maxSalary = 80000.0;
                        break;
                    case "associate":
                        minSalary = 60000.0;
                        maxSalary = 110000.0;
                        break;
                    case "full":
                        minSalary = 75000.0;
                        maxSalary = 130000.0;
                        break;
                    default:
                        minSalary = maxSalary = 0.0;
                }

                double salary = minSalary + (maxSalary - minSalary) * random.nextDouble();

                String line = String.format("%s %s %s %.2f%n", firstName, lastName, rank, salary);
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

