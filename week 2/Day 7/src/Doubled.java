import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {

        String file = "duplicated-chars.txt";

        decryptDouble(file);

    }

    private static void decryptDouble(String fileName) {

        Path pathFileName = Paths.get(fileName);
        Path outPut = Paths.get("notDuplicated-chars.txt");


        List<String> lines = new ArrayList<>();
        List<String> decryptedLines = new ArrayList<>();

        try {
            lines = Files.readAllLines(pathFileName);
        } catch (FileNotFoundException e1) {
            System.err.println("File not found");
        } catch (IOException e2) {
            e2.printStackTrace();
        }


        for (String line : lines) {
            StringBuilder sb = new StringBuilder();

            for (int a = 0; a < line.length() - 1; a = a + 2) {
                sb.append(line.charAt(a));

            }
            decryptedLines.add(sb.toString());
        }
        try {
            Files.write(outPut, decryptedLines);
        } catch (IOException e2) {
            e2.printStackTrace();
        }


    }
}

// Create a method called decryptDoubled() that takes a filename as string as a parameter
// and it can decrypt the duplicated-chars.txt file
// Decryption is the process reversing an encryption, i.e. the process
// which converts encrypted data into its original form.
// If the file can't be opened it should return this message: File not found
// The result should be saved in the output.txt file
