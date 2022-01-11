package OOP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        Path path1 = Paths.get("src/OOP/my-file.txt");
        Path path2 = Paths.get("src/OOP/my-file-copied.txt");
        System.out.println(copyFile(path1, path2));
    }

    private static boolean copyFile(Path file1, Path file2) {
        boolean success = false;
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(file1);
            Files.write(file2, fileContent);
            success = true;
        } catch (IOException e) {
            System.err.println("Cant copy file!");
        }
        return success;




    }

}
// Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.