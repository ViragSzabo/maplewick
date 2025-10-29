package implementation.week10.Examination.FileHandling;

import java.io.*;

public class FileHandling {
    public static void userFunction() {
        // Open files in respective modes
        String inputFilename = "C:\\Users\\szabo\\OneDrive\\Dokumentumok\\GitHub\\maplewick\\implementation\\implementation\\week10\\Examination\\input.txt";
        String outputFilename = "C:\\Users\\szabo\\OneDrive\\Dokumentumok\\GitHub\\maplewick\\implementation\\implementation\\week10\\Examination\\output.txt";

        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(inputFilename));
            BufferedWriter outputFile = new BufferedWriter(new FileWriter(outputFilename));

            // Read and write the numbers from the file
            String line;
            while ((line = inputFile.readLine()) != null) {
                int number = Integer.parseInt(line);
                outputFile.write(Integer.toString(2*number));
                outputFile.newLine();
            }
            // Close the file
            inputFile.close();
            outputFile.close();

            // Display the contents of output.txt
            BufferedReader outputReader = new BufferedReader(new FileReader(outputFilename));
            while ((line = outputReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        userFunction();
    }
}