package logic;

import java.io.*;

public class StatisticsGenerator {
    private String fileName;

    public StatisticsGenerator(String fileName) {
        this.fileName = fileName;
    }

    public void generateReport(String content) {
        try (
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter);
        ) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }
}
