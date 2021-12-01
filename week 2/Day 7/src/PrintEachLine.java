import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        Path path = Paths.get("my-file.txt");
        try {
            Files.readAllLines(path);
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);

            }
        }
        catch (IOException chyba) {
            System.out.println("not founded .txt");
        }






    }
}
// Write a program that opens a file called "my-file.txt" and prints each
// line from the file.
// If the program is unable to read the file (for example the file does not exist),
// it should print the following error message: "Unable to read file: my-file.txt".
