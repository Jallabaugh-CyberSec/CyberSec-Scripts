import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogParser {
    public static void main(String[] args) {
        String logFile = "sample_log.txt"; // Simulated log file
        try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("failed_login")) {
                    System.out.println("Alert: Failed login detected - " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading log file: " + e.getMessage());
        }
    }
}