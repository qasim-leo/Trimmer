import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Trimmer {
    public static void main(String[] args) {
        String inputFilePath = "random_data.dat";
        String outputFilePath = "trimmed_data.dat";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().startsWith("//") && !line.trim().isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            reader.close();
            writer.close();
            System.out.println("Comments | White-spaces removed and saved to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}