import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestScoresAverage {
    public static void main(String[] args) {
        String csvFileName = "test_scores.csv"; // Update with your CSV file name
        double totalScore = 0.0;
        int numberOfScores = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] scores = line.split(",");
                for (String scoreStr : scores) {
                    try {
                        double score = Double.parseDouble(scoreStr);
                        totalScore += score;
                        numberOfScores++;
                    } catch (NumberFormatException e) {
                        System.err.println("Ignoring invalid score: " + scoreStr);
                    }
                }
            }

            if (numberOfScores > 0) {
                double average = totalScore / numberOfScores;
                System.out.println("Total test scores: " + numberOfScores);
                System.out.println("Average test score: " + average);
            } else {
                System.out.println("No valid scores found in the CSV file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
