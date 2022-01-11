package OOP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        System.out.println(countLines("src/OOP/my-file.txt"));
    }
    public static int countLines(String fileName) {
        try {
            Path myFilePath = Paths.get(fileName);
            List<String> myImportedFile = Files.readAllLines(myFilePath);
            int myImportedFileLinesCount = myImportedFile.size();
            return myImportedFileLinesCount;
        } catch (IOException e) {
            System.err.println("Error");
            return 0;
        }
    }

}
// Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.